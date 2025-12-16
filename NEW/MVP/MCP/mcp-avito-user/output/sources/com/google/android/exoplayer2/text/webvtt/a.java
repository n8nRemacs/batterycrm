package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.webvtt.f;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: classes6.dex */
public final class a extends com.google.android.exoplayer2.text.g {

    /* renamed from: o, reason: collision with root package name */
    public final F f347076o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f347076o = new F();
    }

    @Override // com.google.android.exoplayer2.text.g
    public final com.google.android.exoplayer2.text.h i(int i12, byte[] bArr, boolean z12) throws SubtitleDecoderException {
        com.google.android.exoplayer2.text.a aVarA;
        F f12 = this.f347076o;
        f12.z(i12, bArr);
        ArrayList arrayList = new ArrayList();
        while (f12.a() > 0) {
            if (f12.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iD2 = f12.d();
            if (f12.d() == 1987343459) {
                int i13 = iD2 - 8;
                CharSequence charSequenceF = null;
                a.c cVarA = null;
                while (i13 > 0) {
                    if (i13 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iD3 = f12.d();
                    int iD4 = f12.d();
                    int i14 = iD3 - 8;
                    byte[] bArr2 = f12.f348070a;
                    int i15 = f12.f348071b;
                    int i16 = U.f348106a;
                    String str = new String(bArr2, i15, i14, C37262f.f359034c);
                    f12.C(i14);
                    i13 = (i13 - 8) - i14;
                    if (iD4 == 1937011815) {
                        Pattern pattern = f.f347102a;
                        f.e eVar = new f.e();
                        f.e(str, eVar);
                        cVarA = eVar.a();
                    } else if (iD4 == 1885436268) {
                        charSequenceF = f.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (cVarA != null) {
                    cVarA.f346734a = charSequenceF;
                    aVarA = cVarA.a();
                } else {
                    Pattern pattern2 = f.f347102a;
                    f.e eVar2 = new f.e();
                    eVar2.f347117c = charSequenceF;
                    aVarA = eVar2.a().a();
                }
                arrayList.add(aVarA);
            } else {
                f12.C(iD2 - 8);
            }
        }
        return new b(arrayList);
    }
}
