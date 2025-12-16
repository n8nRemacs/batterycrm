package com.avito.android.code_confirmation.phone_management;

import Sm0.InterfaceC15202a;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneManagementPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/w;", "Lcom/avito/android/code_confirmation/phone_management/j;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f119706a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f119707b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f119708c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PhoneManagementIntentFactory.CallSource f119709d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f119710e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CodeConfirmationSource f119711f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f119712g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public E f119713h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public PhoneManagementActivity f119714i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f119715j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f119716k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public String f119717l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public Map<String, String> f119718m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public String f119719n;

    @Inject
    public w(@Y61.k g gVar, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k PhoneManagementIntentFactory.CallSource callSource, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k CodeConfirmationSource codeConfirmationSource, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l Kundle kundle) {
        Map<String, String> mapC;
        this.f119706a = gVar;
        this.f119707b = interfaceC15202a;
        this.f119708c = interfaceC35745a5;
        this.f119709d = callSource;
        this.f119710e = interfaceC30274a;
        this.f119711f = codeConfirmationSource;
        this.f119712g = aVar;
        String strG = kundle != null ? kundle.g("phone") : null;
        this.f119717l = strG == null ? "" : strG;
        this.f119718m = (kundle == null || (mapC = kundle.c("messages")) == null) ? P0.c() : mapC;
        this.f119719n = kundle != null ? kundle.g("confirmed_phone") : null;
    }

    @Override // com.avito.android.code_confirmation.phone_management.j
    public final void a(@Y61.k PhoneManagementActivity phoneManagementActivity) {
        this.f119714i = phoneManagementActivity;
        String str = this.f119719n;
        if (str != null) {
            b(str);
        }
    }

    @Override // com.avito.android.code_confirmation.phone_management.j
    public final void b(@Y61.k String str) {
        this.f119719n = str;
        PhoneManagementActivity phoneManagementActivity = this.f119714i;
        if (phoneManagementActivity == null) {
            return;
        }
        this.f119719n = null;
        phoneManagementActivity.a2(true);
    }

    @Override // com.avito.android.code_confirmation.phone_management.j
    public final void c(@Y61.k final E e12) throws Resources.NotFoundException {
        int i12;
        E e13;
        this.f119713h = e12;
        String str = this.f119717l;
        Input input = e12.f119657g;
        Input.t(input, str, false, 6);
        Map<String, String> map = this.f119718m;
        this.f119718m = map;
        if (!map.isEmpty() && (e13 = this.f119713h) != null) {
            e13.c((String) C42745f0.D(map.values()));
        }
        InterfaceC15202a interfaceC15202a = this.f119707b;
        Resources f15141a = interfaceC15202a.getF15141a();
        PhoneManagementIntentFactory.CallSource callSource = this.f119709d;
        if (callSource instanceof PhoneManagementIntentFactory.CallSource.Deeplink) {
            i12 = R.string.attach_phone_number;
        } else {
            if (!(callSource instanceof PhoneManagementIntentFactory.CallSource.Messenger)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.verify_phone_number;
        }
        e12.f119654d.setText(f15141a.getString(i12));
        E e14 = this.f119713h;
        if (e14 != null) {
            D6.w(e14.f119655e);
        }
        input.setHint(interfaceC15202a.getF15141a().getString(R.string.phone_number));
        String string = interfaceC15202a.getF15141a().getString(R.string.attach_button_text);
        Button button = e12.f119656f;
        button.setText(string);
        io.reactivex.rxjava3.disposables.d dVarT0 = H0.f403644b.t0(new l(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f119716k;
        cVar.b(dVarT0);
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.code_confirmation.phone_management.A
            @Override // io.reactivex.rxjava3.core.C
            public final void f(io.reactivex.rxjava3.core.B b12) {
                final E e15 = e12;
                b12.f(new l41.f() { // from class: com.avito.android.code_confirmation.phone_management.B
                    @Override // l41.f
                    public final void cancel() {
                        e15.f119653c.c(R.attr.ic_arrowBack24, C.f119649l);
                    }
                });
                e15.f119653c.c(R.attr.ic_close24, new D(b12));
            }
        }).t0(new m(e12, this)));
        cVar.b(io.reactivex.rxjava3.core.z.g0(C37722i.a(button), com.avito.android.lib.design.input.n.d(input)).t0(new n(this)));
        cVar.b(com.avito.android.lib.design.input.n.e(input).t0(new o(this)));
    }

    @Override // com.avito.android.code_confirmation.phone_management.j
    public final void c0() {
        this.f119715j.e();
        this.f119714i = null;
    }

    @Override // com.avito.android.code_confirmation.phone_management.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("phone", this.f119717l);
        kundle.n("messages", this.f119718m);
        kundle.m("confirmed_phone", this.f119719n);
        return kundle;
    }

    @Override // com.avito.android.code_confirmation.phone_management.j
    public final void e0() {
        this.f119716k.e();
        this.f119713h = null;
    }
}
