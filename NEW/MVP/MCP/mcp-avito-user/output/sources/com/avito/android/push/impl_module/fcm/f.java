package com.avito.android.push.impl_module.fcm;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FcmMigrationStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/f;", "Lcom/avito/android/push/impl_module/fcm/e;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f245947b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f245948a;

    /* compiled from: FcmMigrationStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/f$a;", "", "<init>", "()V", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f245947b = "lastFirebaseApplicationId";
    }

    @Inject
    public f(@Y61.k AK0.l lVar) {
        this.f245948a = lVar;
    }

    @Override // com.avito.android.push.impl_module.fcm.e
    @Y61.k
    public final String a() {
        String string = this.f245948a.getString(f245947b);
        return string == null ? "" : string;
    }

    @Override // com.avito.android.push.impl_module.fcm.e
    public final void b(@Y61.k String str) {
        this.f245948a.putString(f245947b, str);
    }
}
