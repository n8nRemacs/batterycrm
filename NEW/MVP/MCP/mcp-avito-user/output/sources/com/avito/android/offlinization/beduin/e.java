package com.avito.android.offlinization.beduin;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import org.json.JSONObject;

/* compiled from: BeduinPatternCacheProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/beduin/e;", "", "a", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f208543a = a.f208544a;

    /* compiled from: BeduinPatternCacheProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/beduin/e$a;", "", "<init>", "()V", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f208544a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C6219a f208545b = new C6219a();

        /* compiled from: BeduinPatternCacheProvider.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/offlinization/beduin/e$a$a", "Lcom/avito/android/offlinization/beduin/e;", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.offlinization.beduin.e$a$a, reason: collision with other inner class name */
        public static final class C6219a implements e {
            @Override // com.avito.android.offlinization.beduin.e
            @Y61.k
            public final List<String> a(@Y61.k String str) {
                return C42784z0.f406748b;
            }

            @Override // com.avito.android.offlinization.beduin.e
            @Y61.k
            public final String b(@Y61.k JSONObject jSONObject, @Y61.k String str, boolean z12) {
                return jSONObject.toString();
            }
        }
    }

    @Y61.k
    List<String> a(@Y61.k String str);

    @Y61.k
    String b(@Y61.k JSONObject jSONObject, @Y61.k String str, boolean z12);
}
