package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.details.S0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.InterfaceC35745a5;
import fc.C40396a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAuctionOfferShownEventTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/e;", "Lcom/avito/android/publish/analytics/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33519e implements InterfaceC33518d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232205a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S0 f232206b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CategoryParameters f232208d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f232209e;

    /* compiled from: PublishAuctionOfferShownEventTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", SearchParamsConverterKt.LOCATION_ID, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.analytics.e$a */
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33519e c33519e = C33519e.this;
            c33519e.f232205a.c(new C40396a(null, (String) obj, "lot-from-add", c33519e.f232206b.Y7()));
        }
    }

    @Inject
    public C33519e(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k S0 s02, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f232205a = interfaceC28373a;
        this.f232206b = s02;
        this.f232207c = interfaceC35745a5;
        this.f232208d = s02.C0();
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33518d
    public final void a() {
        if (this.f232209e) {
            return;
        }
        new io.reactivex.rxjava3.internal.operators.single.G(new VH0.c(this, 24)).z(this.f232207c.a()).u(new C32102w0(3)).x(new a(), io.reactivex.rxjava3.internal.functions.a.f401996f);
        this.f232209e = true;
    }
}
