package com.avito.android.wallet.page.history.details.mvi.factory;

import Y41.p;
import Y61.k;
import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentHistoryDetailsFiscalizationDialogFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/factory/c;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f327950a = new c();

    /* compiled from: PaymentHistoryDetailsFiscalizationDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f327951l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(2);
            this.f327951l = context;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            bVar2.setTitle(R.string.payment_fiscalization_error_title);
            Context context = this.f327951l;
            bVar2.setSubtitle(context.getString(R.string.payment_please_write_to_email_pattern, "support@avito.ru"));
            bVar2.setButtonsOrientation(1);
            bVar2.O3(R.string.payment_close, new com.avito.android.wallet.page.history.details.mvi.factory.a(dialogInterface2));
            bVar2.T3(R.string.payment_copy_email, new com.avito.android.wallet.page.history.details.mvi.factory.b(context, dialogInterface2));
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryDetailsFiscalizationDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f327952l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            bVar2.setTitle(R.string.payment_fiscalization_error_title);
            bVar2.setSubtitle(R.string.payment_repeat_in_10_minutes);
            bVar2.O3(R.string.payment_clear, new d(dialogInterface));
            return G0.f406611a;
        }
    }

    @k
    public static com.avito.android.lib.design.modal.a a(@k Context context) {
        return a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, context, new a(context));
    }

    @k
    public static com.avito.android.lib.design.modal.a b(@k Context context) {
        return a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, context, b.f327952l);
    }
}
