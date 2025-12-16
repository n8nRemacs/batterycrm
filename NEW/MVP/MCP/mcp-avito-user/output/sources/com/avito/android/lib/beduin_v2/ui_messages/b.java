package com.avito.android.lib.beduin_v2.ui_messages;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;

/* compiled from: ToastBarHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/ui_messages/b;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f177570a = new b();

    /* compiled from: ToastBarHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinOneTimeEvent.ShowToastBar.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BeduinOneTimeEvent.ShowToastBar.Type type = BeduinOneTimeEvent.ShowToastBar.Type.f176273b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BeduinOneTimeEvent.ShowToastBar.Type type2 = BeduinOneTimeEvent.ShowToastBar.Type.f176273b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ToastBarHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.ui_messages.b$b, reason: collision with other inner class name */
    public static final class C5236b implements i.b, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f177571b;

        public C5236b(Y41.a aVar) {
            this.f177571b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof i.b) && (obj instanceof D)) {
                return L.f(this.f177571b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f177571b;
        }

        public final int hashCode() {
            return this.f177571b.hashCode();
        }

        @Override // com.avito.android.lib.design.toast_bar.i.b
        public final /* synthetic */ void invoke() {
            this.f177571b.invoke();
        }
    }

    @k
    public static com.avito.android.lib.design.toast_bar.k a(@k View view, @k BeduinOneTimeEvent.ShowToastBar showToastBar) {
        List listSingletonList;
        f fVarB;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(showToastBar.f176269a);
        BeduinOneTimeEvent.ShowToastBar.a aVar = showToastBar.f176270b;
        if (aVar != null) {
            listSingletonList = Collections.singletonList(new c.a.C3719a(aVar.f176278a, true, null, new c(aVar), 4, null));
        } else {
            listSingletonList = C42784z0.f406748b;
        }
        List list = listSingletonList;
        Y41.a<G0> aVar2 = showToastBar.f176272d;
        C5236b c5236b = aVar2 != null ? new C5236b(aVar2) : null;
        int iOrdinal = showToastBar.f176271c.ordinal();
        if (iOrdinal == 0) {
            fVarB = f.a.f125253a;
        } else if (iOrdinal == 1) {
            fVarB = f.b.f125254a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f.c.f125255c.getClass();
            fVarB = f.c.a.b();
        }
        return com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, list, null, fVarB, 0, null, null, false, false, c5236b, null, 3050);
    }
}
