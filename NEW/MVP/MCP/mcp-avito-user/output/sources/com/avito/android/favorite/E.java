package com.avito.android.favorite;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShowOnlyActiveFavoritesSwitchValueStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite/E;", "Lcom/avito/android/favorite/D;", "a", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f155160a;

    /* compiled from: ShowOnlyActiveFavoritesSwitchValueStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/favorite/E$a;", "", "<init>", "()V", "", "ACTIVE_ONLY_FILTER", "Ljava/lang/String;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public E(@Y61.k AK0.l lVar) {
        this.f155160a = lVar;
    }

    @Override // com.avito.android.favorite.D
    public final void a(@Y61.l String str, boolean z12) {
        String strConcat;
        String str2 = "active_only_toggle";
        if (str != null && (strConcat = "active_only_toggle".concat(str)) != null) {
            str2 = strConcat;
        }
        this.f155160a.putBoolean(str2, z12);
    }

    @Override // com.avito.android.favorite.G
    public final boolean b(@Y61.l String str, boolean z12) {
        String strConcat;
        String str2 = "active_only_toggle";
        if (str != null && (strConcat = "active_only_toggle".concat(str)) != null) {
            str2 = strConcat;
        }
        return this.f155160a.getBoolean(str2, z12);
    }
}
