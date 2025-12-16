package com.avito.android.user_advert.advert.items.number;

import Y61.k;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: MyAdvertNumberItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/items/number/a;", "Lcom/avito/conveyor_item/a;", "a", "c", "Lcom/avito/android/user_advert/advert/items/number/a$a;", "Lcom/avito/android/user_advert/advert/items/number/a$c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a extends com.avito.conveyor_item.a {

    /* compiled from: MyAdvertNumberItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/number/a$a;", "Lcom/avito/android/user_advert/advert/items/number/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.items.number.a$a, reason: collision with other inner class name */
    public static final class C9498a implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f309749b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f309750c;

        /* renamed from: d, reason: collision with root package name */
        public final long f309751d;

        public C9498a(@k String str, @k String str2, long j12) {
            this.f309749b = str;
            this.f309750c = str2;
            this.f309751d = j12;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF322725b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF309752b() {
            return this.f309749b;
        }
    }

    /* compiled from: MyAdvertNumberItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: MyAdvertNumberItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/number/a$c;", "Lcom/avito/android/user_advert/advert/items/number/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f309752b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f309753c;

        public c(@k String str, @k String str2) {
            this.f309752b = str;
            this.f309753c = str2;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF322725b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF311867b() {
            return this.f309752b;
        }
    }
}
