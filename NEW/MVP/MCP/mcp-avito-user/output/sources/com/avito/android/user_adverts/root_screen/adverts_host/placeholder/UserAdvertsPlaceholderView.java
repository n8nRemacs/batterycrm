package com.avito.android.user_adverts.root_screen.adverts_host.placeholder;

import X41.j;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.error.z;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.C35835l0;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsPlaceholderView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u0019\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/placeholder/UserAdvertsPlaceholderView;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/remote/error/ApiError;", "apiError", "Lkotlin/G0;", "setAdvertsError", "(Lcom/avito/android/remote/error/ApiError;)V", "Lkotlin/Function0;", "onRefreshListener", "setRefreshClickListener", "(LY41/a;)V", "LWU/a;", "e", "Lkotlin/C;", "getAdvertsEmptyState", "()LWU/a;", "advertsEmptyState", "f", "getAdvertsNoInternetErrorState", "advertsNoInternetErrorState", "g", "getAdvertsUnknownErrorState", "advertsUnknownErrorState", "h", "getAdvertsErrorState", "advertsErrorState", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsPlaceholderView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Spinner f313773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ContentPlaceholder f313774c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Y41.a<G0> f313775d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f313776e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f313777f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f313778g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Object f313779h;

    /* compiled from: UserAdvertsPlaceholderView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "msg", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            UserAdvertsPlaceholderView userAdvertsPlaceholderView = UserAdvertsPlaceholderView.this;
            PrintableText printableText = userAdvertsPlaceholderView.getAdvertsUnknownErrorState().f17927c;
            boolean zF2 = L.f(printableText != null ? printableText.k0(userAdvertsPlaceholderView.getContext()) : null, str2);
            ContentPlaceholder contentPlaceholder = userAdvertsPlaceholderView.f313774c;
            if (zF2) {
                contentPlaceholder.setState(userAdvertsPlaceholderView.getAdvertsUnknownErrorState());
            } else {
                contentPlaceholder.setState(WU.a.a(userAdvertsPlaceholderView.getAdvertsErrorState(), null, com.avito.android.printable_text.b.f(str2), 27));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsPlaceholderView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            UserAdvertsPlaceholderView userAdvertsPlaceholderView = UserAdvertsPlaceholderView.this;
            userAdvertsPlaceholderView.f313774c.setState(userAdvertsPlaceholderView.getAdvertsNoInternetErrorState());
            return G0.f406611a;
        }
    }

    @j
    public UserAdvertsPlaceholderView(@k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final WU.a getAdvertsEmptyState() {
        return (WU.a) this.f313776e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final WU.a getAdvertsErrorState() {
        return (WU.a) this.f313779h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final WU.a getAdvertsNoInternetErrorState() {
        return (WU.a) this.f313777f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final WU.a getAdvertsUnknownErrorState() {
        return (WU.a) this.f313778g.getValue();
    }

    public final void d() {
        this.f313773b.setVisibility(8);
        ContentPlaceholder contentPlaceholder = this.f313774c;
        contentPlaceholder.setVisibility(0);
        contentPlaceholder.setState(getAdvertsEmptyState());
    }

    public final void setAdvertsError(@Y61.l ApiError apiError) {
        this.f313773b.setVisibility(8);
        ContentPlaceholder contentPlaceholder = this.f313774c;
        contentPlaceholder.setVisibility(0);
        if (apiError == null) {
            contentPlaceholder.setState(getAdvertsUnknownErrorState());
            return;
        }
        a aVar = new a();
        b bVar = new b();
        PrintableText printableTextA = getAdvertsUnknownErrorState().f17927c;
        if (printableTextA == null) {
            printableTextA = com.avito.android.printable_text.b.a();
        }
        z.g(apiError, aVar, null, null, bVar, printableTextA, 6);
    }

    public final void setRefreshClickListener(@k Y41.a<G0> onRefreshListener) {
        this.f313775d = onRefreshListener;
    }

    public UserAdvertsPlaceholderView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).f21657a == 2132024975) ? context : new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23), (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f313775d = f.f313788l;
        com.avito.android.user_adverts.root_screen.adverts_host.placeholder.a aVar = com.avito.android.user_adverts.root_screen.adverts_host.placeholder.a.f313782l;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f313776e = C42727D.b(lazyThreadSafetyMode, aVar);
        this.f313777f = C42727D.b(lazyThreadSafetyMode, new d(this));
        this.f313778g = C42727D.b(lazyThreadSafetyMode, new e(this));
        this.f313779h = C42727D.b(lazyThreadSafetyMode, new com.avito.android.user_adverts.root_screen.adverts_host.placeholder.b(this));
        LayoutInflater.from(getContext()).inflate(R.layout.user_adverts_content_placeholder, this);
        this.f313773b = (Spinner) findViewById(R.id.user_adverts_spinner);
        this.f313774c = (ContentPlaceholder) findViewById(R.id.user_adverts_placeholder);
        setBackgroundColor(C35835l0.d(R.attr.white, getContext()));
    }
}
