package com.avito.android.advert.viewed.persistance;

import androidx.appcompat.app.r;
import androidx.room.InterfaceC23452i0;
import androidx.room.InterfaceC23472t;
import androidx.room.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ViewedAdvertData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/viewed/persistance/a;", "", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    @InterfaceC23452i0
    public final String f81034a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    public final long f81035b;

    /* compiled from: ViewedAdvertData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/viewed/persistance/a$a;", "", "<init>", "()V", "", "COLUMN_ADD_TIME", "Ljava/lang/String;", "COLUMN_ADVERT_STRING_ID", "TABLE_NAME", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.viewed.persistance.a$a, reason: collision with other inner class name */
    public static final class C2402a {
        public /* synthetic */ C2402a(C42822w c42822w) {
            this();
        }

        public C2402a() {
        }
    }

    static {
        new C2402a(null);
    }

    public a(@Y61.k String str, long j12) {
        this.f81034a = str;
        this.f81035b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f81034a, aVar.f81034a) && this.f81035b == aVar.f81035b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81035b) + (this.f81034a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewedAdvertData(advertStringId=");
        sb2.append(this.f81034a);
        sb2.append(", addTime=");
        return r.u(sb2, this.f81035b, ')');
    }
}
