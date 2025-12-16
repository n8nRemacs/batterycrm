package com.avito.android.user_advert.advert;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MyAdvertStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/w1;", "Lcom/avito/android/user_advert/advert/v1;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f310658a;

    /* compiled from: MyAdvertStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/w1$a;", "", "<init>", "()V", "", "ADVERTS_NUMBER_CREATED", "Ljava/lang/String;", "COPY_ADVERT_TOOLTIP_WAS_SHOWN", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public w1(@Y61.k AK0.l lVar) {
        this.f310658a = lVar;
    }

    @Override // com.avito.android.user_advert.advert.v1
    public final boolean a() {
        return this.f310658a.getBoolean("copy_advert_tooltip_was_shown", false);
    }

    @Override // com.avito.android.user_advert.advert.v1
    public final void b() {
        this.f310658a.putBoolean("copy_advert_tooltip_was_shown", true);
    }
}
