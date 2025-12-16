package com.avito.android.navigation_config.generated.api.get_navigation_config;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetNavigationConfigResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse;", "", "Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse$AlternativeMain;", "alternativeMain", "<init>", "(Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse$AlternativeMain;)V", "Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse$AlternativeMain;", "a", "()Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse$AlternativeMain;", "AlternativeMain", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetNavigationConfigResponse {

    @c("alternativeMain")
    @l
    private final AlternativeMain alternativeMain;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetNavigationConfigResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/navigation_config/generated/api/get_navigation_config/GetNavigationConfigResponse$AlternativeMain;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Avito", "Business360", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AlternativeMain {

        @c("avito")
        public static final AlternativeMain Avito;

        @c("business360")
        public static final AlternativeMain Business360;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AlternativeMain[] f207206b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f207207c;

        static {
            AlternativeMain alternativeMain = new AlternativeMain("Avito", 0, "avito");
            Avito = alternativeMain;
            AlternativeMain alternativeMain2 = new AlternativeMain("Business360", 1, "business360");
            Business360 = alternativeMain2;
            AlternativeMain[] alternativeMainArr = {alternativeMain, alternativeMain2};
            f207206b = alternativeMainArr;
            f207207c = kotlin.enums.c.a(alternativeMainArr);
        }

        private AlternativeMain(String str, int i12, String str2) {
        }

        public static AlternativeMain valueOf(String str) {
            return (AlternativeMain) Enum.valueOf(AlternativeMain.class, str);
        }

        public static AlternativeMain[] values() {
            return (AlternativeMain[]) f207206b.clone();
        }
    }

    public GetNavigationConfigResponse(@l AlternativeMain alternativeMain) {
        this.alternativeMain = alternativeMain;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AlternativeMain getAlternativeMain() {
        return this.alternativeMain;
    }
}
