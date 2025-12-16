package com.avito.android.replace_main.generated.api.api_v_1__replace_main_toggle;

import Bm0.C13164b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiV1ReplaceMainToggleResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/replace_main/generated/api/api_v_1__replace_main_toggle/OkRespDataSuccessToggle;", "", "", "clearShowId", "Lcom/avito/android/replace_main/generated/api/api_v_1__replace_main_toggle/OkRespDataSuccessToggle$Main;", "main", "subtitle", "title", "LBm0/b;", "toast", "<init>", "(Ljava/lang/String;Lcom/avito/android/replace_main/generated/api/api_v_1__replace_main_toggle/OkRespDataSuccessToggle$Main;Ljava/lang/String;Ljava/lang/String;LBm0/b;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/replace_main/generated/api/api_v_1__replace_main_toggle/OkRespDataSuccessToggle$Main;", "b", "()Lcom/avito/android/replace_main/generated/api/api_v_1__replace_main_toggle/OkRespDataSuccessToggle$Main;", "c", "d", "LBm0/b;", "e", "()LBm0/b;", "Main", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OkRespDataSuccessToggle {

    @c("clearShowId")
    @k
    private final String clearShowId;

    @c("main")
    @k
    private final Main main;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("toast")
    @k
    private final C13164b toast;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiV1ReplaceMainToggleResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/replace_main/generated/api/api_v_1__replace_main_toggle/OkRespDataSuccessToggle$Main;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Business360", "Avito", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Main {

        @c("avito")
        public static final Main Avito;

        @c("business360")
        public static final Main Business360;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Main[] f254517b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f254518c;

        static {
            Main main = new Main("Business360", 0, "business360");
            Business360 = main;
            Main main2 = new Main("Avito", 1, "avito");
            Avito = main2;
            Main[] mainArr = {main, main2};
            f254517b = mainArr;
            f254518c = kotlin.enums.c.a(mainArr);
        }

        private Main(String str, int i12, String str2) {
        }

        public static Main valueOf(String str) {
            return (Main) Enum.valueOf(Main.class, str);
        }

        public static Main[] values() {
            return (Main[]) f254517b.clone();
        }
    }

    public OkRespDataSuccessToggle(@k String str, @k Main main, @k String str2, @k String str3, @k C13164b c13164b) {
        this.clearShowId = str;
        this.main = main;
        this.subtitle = str2;
        this.title = str3;
        this.toast = c13164b;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getClearShowId() {
        return this.clearShowId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Main getMain() {
        return this.main;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final C13164b getToast() {
        return this.toast;
    }
}
