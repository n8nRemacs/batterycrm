package ij;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFragmentDeeplinkActivityNavigator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lij/a;", "Lcom/avito/android/deeplink_handler/view/a$a;", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ij.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41414a implements a.InterfaceC4053a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BaseFragment f398704b;

    /* compiled from: BeduinFragmentDeeplinkActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lij/a$a;", "", "<init>", "()V", "", "BEDUIN_REQUEST_CODE", "I", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ij.a$a, reason: collision with other inner class name */
    public static final class C11389a {
        public /* synthetic */ C11389a(C42822w c42822w) {
            this();
        }

        public C11389a() {
        }
    }

    static {
        new C11389a(null);
    }

    public C41414a(@k BaseFragment baseFragment) {
        this.f398704b = baseFragment;
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void J(@k Intent intent, int i12, @k l<? super Exception, G0> lVar) {
        C35966w1.e(this.f398704b, intent, i12, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void R(@k Intent intent, @k l<? super Exception, G0> lVar) {
        J(intent, 95, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void X(int i12, @k Intent intent) {
        BaseFragment baseFragment = this.f398704b;
        baseFragment.requireActivity().setResult(i12, intent);
        baseFragment.requireActivity().finish();
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void g1(@k l<? super Context, G0> lVar) {
        lVar.invoke(this.f398704b.requireActivity());
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void s1() {
        this.f398704b.requireActivity().finish();
    }
}
