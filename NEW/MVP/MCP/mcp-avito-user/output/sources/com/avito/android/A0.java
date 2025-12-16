package com.avito.android;

import com.avito.android.ownership.Owners;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: FeaturesHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/A0;", "", "<init>", "()V", "a", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f67174a = new LinkedHashMap();

    /* compiled from: FeaturesHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0084\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/A0$a;", "T", "", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f67175a;

        public a(@Y61.k String str) {
            this.f67175a = str;
        }

        @Y61.k
        public final DE0.a a() {
            return (DE0.a) A0.this.f67174a.get(this.f67175a);
        }
    }

    public static a u(A0 a02, String str, String str2, Object obj, boolean z12, int i12, Owners owners, int i13) {
        String str3 = (i13 & 8) != 0 ? null : "helpcenter-form-46049";
        boolean z13 = (i13 & 16) != 0 ? true : z12;
        int i14 = (i13 & 32) != 0 ? 0 : i12;
        a02.getClass();
        DE0.c cVar = new DE0.c(str, obj, str2, i14, str3, z13, owners);
        if (z13 && (!z13 || !(obj instanceof Boolean))) {
            throw new IllegalStateException(AK.c.k("Toggle ", str2, " must be non-remote. Only boolean toggles are supported.").toString());
        }
        if (((DE0.a) a02.f67174a.put(str2, cVar)) == null) {
            return a02.new a(str2);
        }
        throw new IllegalStateException(androidx.camera.camera2.internal.G.f("Duplicate toggles: ", str2).toString());
    }
}
