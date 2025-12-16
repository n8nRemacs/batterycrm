package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.webvtt.g;
import com.google.common.base.C37262f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: Mp4WebvttDecoder.java */
@J
/* loaded from: classes.dex */
public final class a extends androidx.media3.extractor.text.d {

    /* renamed from: o, reason: collision with root package name */
    public final z f51439o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f51439o = new z();
    }

    @Override // androidx.media3.extractor.text.d
    public final androidx.media3.extractor.text.e i(int i12, byte[] bArr, boolean z12) throws SubtitleDecoderException {
        androidx.media3.common.text.a aVarA;
        z zVar = this.f51439o;
        zVar.D(i12, bArr);
        ArrayList arrayList = new ArrayList();
        while (zVar.a() > 0) {
            if (zVar.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iG2 = zVar.g();
            if (zVar.g() == 1987343459) {
                int i13 = iG2 - 8;
                CharSequence charSequenceF = null;
                a.c cVarA = null;
                while (i13 > 0) {
                    if (i13 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iG3 = zVar.g();
                    int iG4 = zVar.g();
                    int i14 = iG3 - 8;
                    byte[] bArr2 = zVar.f47962a;
                    int i15 = zVar.f47963b;
                    int i16 = M.f47887a;
                    String str = new String(bArr2, i15, i14, C37262f.f359034c);
                    zVar.G(i14);
                    i13 = (i13 - 8) - i14;
                    if (iG4 == 1937011815) {
                        Pattern pattern = g.f51465a;
                        g.e eVar = new g.e();
                        g.e(str, eVar);
                        cVarA = eVar.a();
                    } else if (iG4 == 1885436268) {
                        charSequenceF = g.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (cVarA != null) {
                    cVarA.f47839a = charSequenceF;
                    aVarA = cVarA.a();
                } else {
                    Pattern pattern2 = g.f51465a;
                    g.e eVar2 = new g.e();
                    eVar2.f51480c = charSequenceF;
                    aVarA = eVar2.a().a();
                }
                arrayList.add(aVarA);
            } else {
                zVar.G(iG2 - 8);
            }
        }
        return new b(arrayList);
    }
}
