package com.avito.android.authorization.select_profile;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.utils.D;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.registration.ProfileSocial;
import com.avito.android.remote.model.registration.RegisteredProfile;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectProfilePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/select_profile/SelectProfilePresenterImpl;", "Lcom/avito/android/authorization/select_profile/j;", "ErrorType", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectProfilePresenterImpl implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.select_profile.c f94229a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f94230b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f94231c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f94232d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f94233e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94234f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f94235g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<SelectProfileField> f94236h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94237i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f94238j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public x f94239k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public SelectProfileActivity f94240l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94241m = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94242n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public List<? extends SelectProfileField> f94243o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public PrintableText f94244p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public ErrorType f94245q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public AttributedText f94246r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public RegisteredProfile f94247s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/SelectProfilePresenterImpl$ErrorType;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorType {

        /* renamed from: b, reason: collision with root package name */
        public static final ErrorType f94248b;

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorType f94249c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ErrorType[] f94250d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f94251e;

        static {
            ErrorType errorType = new ErrorType("COMMON_ERROR", 0);
            f94248b = errorType;
            ErrorType errorType2 = new ErrorType("NETWORK_ERROR", 1);
            f94249c = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            f94250d = errorTypeArr;
            f94251e = kotlin.enums.c.a(errorTypeArr);
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f94250d.clone();
        }
    }

    /* compiled from: SelectProfilePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94252a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                ErrorType errorType = ErrorType.f94248b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ErrorType errorType2 = ErrorType.f94248b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94252a = iArr;
        }
    }

    /* compiled from: SelectProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<List<? extends SelectProfileField>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f94254m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12) {
            super(1);
            this.f94254m = z12;
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends SelectProfileField> list) {
            Object next;
            Object next2;
            x xVar;
            List<? extends SelectProfileField> list2 = list;
            SelectProfilePresenterImpl selectProfilePresenterImpl = SelectProfilePresenterImpl.this;
            selectProfilePresenterImpl.f94244p = null;
            selectProfilePresenterImpl.f94245q = null;
            selectProfilePresenterImpl.f94243o = list2;
            List<? extends SelectProfileField> list3 = list2;
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SelectProfileField) next) instanceof SelectProfileField.Title) {
                    break;
                }
            }
            SelectProfileField.Title title = next instanceof SelectProfileField.Title ? (SelectProfileField.Title) next : null;
            PrintableText printableText = title != null ? title.f94265c : null;
            if (printableText != null && (xVar = selectProfilePresenterImpl.f94239k) != null) {
                com.avito.android.printable_text.a.c(xVar.f94462h, printableText);
            }
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((SelectProfileField) next2) instanceof SelectProfileField.Profile) {
                    break;
                }
            }
            SelectProfileField.Profile profile = next2 instanceof SelectProfileField.Profile ? (SelectProfileField.Profile) next2 : null;
            selectProfilePresenterImpl.f94247s = profile != null ? profile.f94260c : null;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (!(((SelectProfileField) obj) instanceof SelectProfileField.Title)) {
                    arrayList.add(obj);
                }
            }
            com.avito.konveyor.util.a.a(selectProfilePresenterImpl.f94230b, arrayList);
            x xVar2 = selectProfilePresenterImpl.f94239k;
            if (xVar2 != null) {
                xVar2.f94464j.notifyDataSetChanged();
            }
            x xVar3 = selectProfilePresenterImpl.f94239k;
            if (xVar3 != null) {
                xVar3.f94463i.j();
                D6.w(xVar3.f94457c);
            }
            if (this.f94254m) {
                selectProfilePresenterImpl.f94237i.c(new he.l(false));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            SelectProfilePresenterImpl selectProfilePresenterImpl = SelectProfilePresenterImpl.this;
            selectProfilePresenterImpl.getClass();
            if (K5.e(th3) || K5.c(th3)) {
                PrintableText printableTextA = InterfaceC35741a1.a.a(selectProfilePresenterImpl.f94235g, th3, null, null, 6);
                selectProfilePresenterImpl.f94244p = printableTextA;
                selectProfilePresenterImpl.f94245q = ErrorType.f94249c;
                x xVar = selectProfilePresenterImpl.f94239k;
                if (xVar != null) {
                    xVar.b(printableTextA);
                }
            } else {
                selectProfilePresenterImpl.f94244p = null;
                selectProfilePresenterImpl.f94245q = ErrorType.f94248b;
                x xVar2 = selectProfilePresenterImpl.f94239k;
                if (xVar2 != null) {
                    xVar2.a();
                }
                selectProfilePresenterImpl.f94237i.c(new he.l(true));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public SelectProfilePresenterImpl(@Y61.k com.avito.android.authorization.select_profile.c cVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k Resources resources, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.jakewharton.rxrelay3.c<SelectProfileField> cVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l Kundle kundle) {
        String strG;
        this.f94229a = cVar;
        this.f94230b = aVar;
        this.f94231c = interfaceC30274a;
        this.f94232d = resources;
        this.f94233e = aVar2;
        this.f94234f = interfaceC35745a5;
        this.f94235g = interfaceC35741a1;
        this.f94236h = cVar2;
        this.f94237i = interfaceC28373a;
        this.f94238j = screenPerformanceTracker;
        this.f94243o = kundle != null ? kundle.e("items") : null;
        this.f94244p = kundle != null ? (PrintableText) kundle.d("errorMessage") : null;
        this.f94245q = (kundle == null || (strG = kundle.g("error_type")) == null) ? null : ErrorType.valueOf(strG);
        this.f94246r = kundle != null ? (AttributedText) kundle.d("create_warning") : null;
        this.f94247s = kundle != null ? (RegisteredProfile) kundle.d("first_profile") : null;
    }

    public static final void c(SelectProfilePresenterImpl selectProfilePresenterImpl, RegisteredProfile registeredProfile) {
        SelectProfileActivity selectProfileActivity;
        selectProfilePresenterImpl.getClass();
        selectProfilePresenterImpl.f94237i.c(new he.q(false));
        String login = registeredProfile.getLogin();
        List<ProfileSocial> social = registeredProfile.getSocial();
        if (login != null) {
            SelectProfileActivity selectProfileActivity2 = selectProfilePresenterImpl.f94240l;
            if (selectProfileActivity2 != null) {
                Zd.i iVar = selectProfileActivity2.f94226q;
                Zd.i iVar2 = iVar != null ? iVar : null;
                InterfaceC28373a interfaceC28373a = selectProfileActivity2.f94225p;
                selectProfileActivity2.startActivity(iVar2.j(Zd.n.b(selectProfileActivity2, interfaceC28373a != null ? interfaceC28373a : null), (248 & 2) != 0 ? null : login, (248 & 4) != 0 ? null : null, (248 & 8) == 0, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? false : false, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null));
                return;
            }
            return;
        }
        if (social == null || (selectProfileActivity = selectProfilePresenterImpl.f94240l) == null) {
            return;
        }
        Zd.i iVar3 = selectProfileActivity.f94226q;
        if (iVar3 == null) {
            iVar3 = null;
        }
        InterfaceC28373a interfaceC28373a2 = selectProfileActivity.f94225p;
        if (interfaceC28373a2 == null) {
            interfaceC28373a2 = null;
        }
        selectProfileActivity.startActivity(iVar3.f(Zd.n.b(selectProfileActivity, interfaceC28373a2), social, null));
    }

    @Override // com.avito.android.authorization.select_profile.j
    public final void a(@Y61.k x xVar) {
        this.f94239k = xVar;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f94236h.t0(new k(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f94242n;
        cVar.b(dVarT0);
        View view = xVar.f94459e;
        cVar.b((view != null ? C37722i.a(view) : U.f403867b).t0(new l(this)));
        View view2 = xVar.f94460f;
        cVar.b((view2 != null ? C37722i.a(view2) : U.f403867b).t0(new m(this)));
        com.jakewharton.rxrelay3.c<G0> cVar2 = xVar.f94461g;
        cVar.b(com.avito.android.advert.item.delivery_suggests.l.l(cVar2, cVar2).t0(new n(this)));
        cVar.b(xVar.f94463i.e().t0(new o(this)));
        cVar.b(C37722i.a(xVar.f94458d).t0(new p(this)));
    }

    @Override // com.avito.android.authorization.select_profile.j
    public final void b(@Y61.k SelectProfileActivity selectProfileActivity) {
        x xVar;
        this.f94240l = selectProfileActivity;
        ErrorType errorType = this.f94245q;
        int i12 = errorType == null ? -1 : a.f94252a[errorType.ordinal()];
        if (i12 == -1) {
            d(false);
            return;
        }
        if (i12 == 1) {
            x xVar2 = this.f94239k;
            if (xVar2 != null) {
                xVar2.a();
                return;
            }
            return;
        }
        if (i12 == 2 && (xVar = this.f94239k) != null) {
            PrintableText printableTextA = this.f94244p;
            if (printableTextA == null) {
                printableTextA = com.avito.android.printable_text.b.a();
            }
            xVar.b(printableTextA);
        }
    }

    @Override // com.avito.android.authorization.select_profile.j
    public final void c0() {
        this.f94241m.e();
        this.f94240l = null;
    }

    public final void d(boolean z12) {
        List<? extends SelectProfileField> list = this.f94243o;
        this.f94241m.b(D.a(list != null ? I.q(list) : this.f94229a.a().s(this.f94234f.e()).j(new q(this)).r(new r(this)), this.f94238j, null, new b(z12), new c(), 18));
    }

    @Override // com.avito.android.authorization.select_profile.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("items", this.f94243o);
        kundle.j(this.f94244p, "errorMessage");
        ErrorType errorType = this.f94245q;
        kundle.m("error_type", errorType != null ? errorType.name() : null);
        kundle.j(this.f94246r, "create_warning");
        kundle.j(this.f94247s, "first_profile");
        return kundle;
    }

    @Override // com.avito.android.authorization.select_profile.j
    public final void e0() {
        this.f94242n.e();
        this.f94239k = null;
    }
}
