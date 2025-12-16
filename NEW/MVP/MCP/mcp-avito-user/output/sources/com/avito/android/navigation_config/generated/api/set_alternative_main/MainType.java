package com.avito.android.navigation_config.generated.api.set_alternative_main;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SetAlternativeMainRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType;", "", "Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType$Main;", "main", "<init>", "(Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType$Main;)V", "Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType$Main;", "getMain", "()Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType$Main;", "Main", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainType {

    @c("main")
    @k
    private final Main main;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetAlternativeMainRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/navigation_config/generated/api/set_alternative_main/MainType$Main;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Avito", "Business360", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Main {

        @c("avito")
        public static final Main Avito;

        @c("business360")
        public static final Main Business360;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Main[] f207208b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f207209c;

        static {
            Main main = new Main("Avito", 0, "avito");
            Avito = main;
            Main main2 = new Main("Business360", 1, "business360");
            Business360 = main2;
            Main[] mainArr = {main, main2};
            f207208b = mainArr;
            f207209c = kotlin.enums.c.a(mainArr);
        }

        private Main(String str, int i12, String str2) {
        }

        public static Main valueOf(String str) {
            return (Main) Enum.valueOf(Main.class, str);
        }

        public static Main[] values() {
            return (Main[]) f207208b.clone();
        }
    }

    public MainType(@k Main main) {
        this.main = main;
    }
}
