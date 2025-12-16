package com.avito.android.advert.item;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.L5;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToastRenderer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/h1;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.h1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28134h1 implements a.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f75820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f75821c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f75822d;

    public C28134h1(@Y61.k ActivityC22955m activityC22955m, @Y61.k ViewGroup viewGroup, @Y61.k ViewGroup viewGroup2) {
        this.f75820b = activityC22955m;
        this.f75821c = viewGroup;
        this.f75822d = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
        ViewGroup viewGroup;
        kotlin.Q q12;
        com.avito.android.component.toast.f fVar2 = fVar;
        ViewGroup viewGroup2 = this.f75822d;
        if (viewGroup2.getChildCount() == 0) {
            boolean z14 = fVar2 instanceof f.c;
            viewGroup = this.f75821c;
            q12 = (z14 && (fVar2 instanceof f.a)) ? new kotlin.Q(ToastBarPosition.f181047e, viewGroup) : new kotlin.Q(ToastBarPosition.f181046d, viewGroup);
        } else {
            Iterator itA = C22816e.a(viewGroup2);
            while (true) {
                C22833m0 c22833m0 = (C22833m0) itA;
                if (!c22833m0.hasNext()) {
                    break;
                }
                View view = (View) c22833m0.next();
                if (view.getVisibility() == 0 && view.getTranslationY() == 0.0f) {
                    if (fVar2 instanceof f.a) {
                        q12 = new kotlin.Q(ToastBarPosition.f181044b, viewGroup2);
                    }
                }
            }
            boolean z142 = fVar2 instanceof f.c;
            viewGroup = this.f75821c;
            if (z142) {
                q12 = new kotlin.Q(ToastBarPosition.f181046d, viewGroup);
            }
        }
        ToastBarPosition toastBarPosition2 = (ToastBarPosition) q12.f406619b;
        ViewGroup viewGroup3 = (ViewGroup) q12.f406620c;
        if (kotlin.jvm.internal.L.f(fVar2, f.b.f125254a)) {
            fVar2 = f.a.f125253a;
        }
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, viewGroup3, printableText, list, list2, frameLayout, fVar2, i12, toastBarPosition2, null, z12, z13, bVar, str != null ? new ContextThemeWrapper(this.f75820b, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, str)) : null, 128);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void Y1(int i12) {
        L5.a(this.f75820b, i12, 1);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void b2(int i12, @Y61.k f.c cVar, @Y61.k ToastBarPosition toastBarPosition) {
        a.i.C4057a.a(this, i12, cVar, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    @InterfaceC42830m
    public final void m0(@Y61.k String str, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition) {
        a.i.C4057a.b(this, str, fVar, i12, toastBarPosition);
    }

    @Override // com.avito.android.deeplink_handler.view.a.i
    public final void z1(@Y61.k String str) {
        L5.b(this.f75820b, str, 1);
    }
}
