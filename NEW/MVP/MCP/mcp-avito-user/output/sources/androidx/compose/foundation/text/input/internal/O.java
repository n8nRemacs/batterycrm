package androidx.compose.foundation.text.input.internal;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import androidx.compose.ui.text.v0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import okhttp3.internal.http2.Http2;

/* compiled from: EditorInfo.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O {
    public static final void a(@Y61.k EditorInfo editorInfo, @Y61.k CharSequence charSequence, long j12, @Y61.k C22655v c22655v, @Y61.l String[] strArr) {
        String str;
        int i12 = c22655v.f42483e;
        C22654u.f42467b.getClass();
        boolean zB2 = C22654u.b(i12, C22654u.f42469d);
        int i13 = 3;
        int i14 = 6;
        boolean z12 = c22655v.f42479a;
        if (zB2) {
            if (!z12) {
                i14 = 0;
            }
        } else if (C22654u.b(i12, 0)) {
            i14 = 1;
        } else if (C22654u.b(i12, C22654u.f42470e)) {
            i14 = 2;
        } else if (C22654u.b(i12, C22654u.f42474i)) {
            i14 = 5;
        } else if (C22654u.b(i12, C22654u.f42473h)) {
            i14 = 7;
        } else if (C22654u.b(i12, C22654u.f42471f)) {
            i14 = 3;
        } else if (C22654u.b(i12, C22654u.f42472g)) {
            i14 = 4;
        } else if (!C22654u.b(i12, C22654u.f42475j)) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i14;
        androidx.compose.ui.text.input.O o12 = c22655v.f42484f;
        if (o12 != null && (str = o12.f42366a) != null) {
            editorInfo.privateImeOptions = str;
        }
        C20948w0.f31499a.getClass();
        z0.f.f443676d.getClass();
        z0.f fVar = z0.f.f443677e;
        z0.f fVar2 = c22655v.f42485g;
        if (kotlin.jvm.internal.L.f(fVar2, fVar)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(C42745f0.q(fVar2, 10));
            Iterator<z0.e> it = fVar2.f443678b.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f443675a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        androidx.compose.ui.text.input.C.f42345b.getClass();
        int i15 = androidx.compose.ui.text.input.C.f42346c;
        int i16 = c22655v.f42482d;
        if (androidx.compose.ui.text.input.C.b(i16, i15)) {
            i13 = 1;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42347d)) {
            editorInfo.imeOptions |= BeduinInputModel.MIN_TEXT_VERSION;
            i13 = 1;
        } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42348e)) {
            i13 = 2;
        } else if (!androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42349f)) {
            if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42350g)) {
                i13 = 17;
            } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42351h)) {
                i13 = 33;
            } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42352i)) {
                i13 = 129;
            } else if (androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42353j)) {
                i13 = 18;
            } else {
                if (!androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42354k)) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i13 = 8194;
            }
        }
        editorInfo.inputType = i13;
        if (!z12 && (i13 & 1) == 1) {
            editorInfo.inputType = 131072 | i13;
            C22654u.f42467b.getClass();
            if (C22654u.b(c22655v.f42483e, C22654u.f42469d)) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            androidx.compose.ui.text.input.B.f42339b.getClass();
            int i17 = androidx.compose.ui.text.input.B.f42341d;
            int i18 = c22655v.f42480b;
            if (androidx.compose.ui.text.input.B.b(i18, i17)) {
                editorInfo.inputType |= 4096;
            } else if (androidx.compose.ui.text.input.B.b(i18, androidx.compose.ui.text.input.B.f42342e)) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.B.b(i18, androidx.compose.ui.text.input.B.f42343f)) {
                editorInfo.inputType |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (c22655v.f42481c) {
                editorInfo.inputType |= 32768;
            }
        }
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        editorInfo.initialSelStart = (int) (j12 >> 32);
        editorInfo.initialSelEnd = (int) (j12 & 4294967295L);
        androidx.core.view.inputmethod.a.a(editorInfo, charSequence);
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        editorInfo.imeOptions |= 33554432;
        if (!androidx.compose.foundation.text.handwriting.j.f30741a || androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42352i) || androidx.compose.ui.text.input.C.b(i16, androidx.compose.ui.text.input.C.f42353j)) {
            androidx.core.view.inputmethod.a.b(editorInfo, false);
            return;
        }
        androidx.core.view.inputmethod.a.b(editorInfo, true);
        N.f30863a.getClass();
        editorInfo.setSupportedHandwritingGestures(C42745f0.U(IK.d.o(), IK.d.A(), IK.d.w(), IK.d.y(), IK.d.B(), IK.d.C(), IK.d.D()));
        editorInfo.setSupportedHandwritingGesturePreviews(C42756l.l0(new Class[]{IK.d.o(), IK.d.A(), IK.d.w(), IK.d.y()}));
    }
}
