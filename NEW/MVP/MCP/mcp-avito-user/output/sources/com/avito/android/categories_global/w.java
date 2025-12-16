package com.avito.android.categories_global;

import android.app.Activity;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C23397v;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"LLn/e;", VoiceInfo.STATE, "_avito-global_categories-global_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(C23397v c23397v, y yVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1659645758);
        androidx.view.compose.h.a(false, new j(yVar), bE2, 0, 1);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        Object objO = bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        Activity activity = objO instanceof Activity ? (Activity) objO : null;
        C22187u0.d(new k(yVar, c23397v, activity, uVarA, jP2, u0.i.c(bE2, R.string.categories_global_error), null), bE2, G0.f406611a);
        com.avito.android.categories_global.compose.g.a((Ln.e) C22126m3.b(yVar.getState(), bE2).getF42167b(), new l(1, yVar, y.class, "accept", "accept(Ljava/lang/Object;)V", 0), bE2, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(c23397v, yVar, i12);
        }
    }
}
