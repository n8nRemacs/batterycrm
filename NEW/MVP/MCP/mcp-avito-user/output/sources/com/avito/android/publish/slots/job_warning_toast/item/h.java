package com.avito.android.publish.slots.job_warning_toast.item;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobToastSlotItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/job_warning_toast/item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/job_warning_toast/item/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f244474b;

    /* compiled from: JobToastSlotItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.job_warning_toast.item.a f244476m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.publish.slots.job_warning_toast.item.a aVar) {
            super(0);
            this.f244476m = aVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            ViewGroup viewGroup = h.this.f244474b;
            com.avito.android.publish.slots.job_warning_toast.item.a aVar = this.f244476m;
            com.avito.android.component.toast.c.b(cVar, viewGroup, com.avito.android.printable_text.b.f(aVar.f244466c), null, aVar.f244469f, null, aVar.f244467d, aVar.f244468e, ToastBarPosition.f181045c, null, false, false, null, null, 3978);
            return Boolean.TRUE;
        }
    }

    public h(@k View view, @k ViewGroup viewGroup) {
        super(view);
        this.f244474b = viewGroup;
    }

    @Override // com.avito.android.publish.slots.job_warning_toast.item.g
    public final void JH(@k com.avito.android.publish.slots.job_warning_toast.item.a aVar) {
        D6.C(new a(aVar), this.f244474b);
    }
}
