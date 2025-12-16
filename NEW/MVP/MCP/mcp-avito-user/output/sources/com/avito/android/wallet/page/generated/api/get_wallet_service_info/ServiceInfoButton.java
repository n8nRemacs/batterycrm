package com.avito.android.wallet.page.generated.api.get_wallet_service_info;

import Y61.k;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetWalletServiceInfoResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton;", "", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton$Action;", "action", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "text", "<init>", "(Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton$Action;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton$Action;", "a", "()Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton$Action;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Action", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceInfoButton {

    @c("action")
    @k
    private final Action action;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final String style;

    @c("text")
    @k
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetWalletServiceInfoResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton$Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Close", "Refresh", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c("close")
        public static final Action Close;

        @c("refresh")
        public static final Action Refresh;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Action[] f327824b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f327825c;

        static {
            Action action = new Action("Close", 0, "close");
            Close = action;
            Action action2 = new Action("Refresh", 1, "refresh");
            Refresh = action2;
            Action[] actionArr = {action, action2};
            f327824b = actionArr;
            f327825c = kotlin.enums.c.a(actionArr);
        }

        private Action(String str, int i12, String str2) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f327824b.clone();
        }
    }

    public ServiceInfoButton(@k Action action, @k String str, @k String str2) {
        this.action = action;
        this.style = str;
        this.text = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
