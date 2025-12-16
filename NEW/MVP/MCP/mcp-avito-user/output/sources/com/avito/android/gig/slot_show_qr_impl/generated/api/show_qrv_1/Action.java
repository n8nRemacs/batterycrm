package com.avito.android.gig.slot_show_qr_impl.generated.api.show_qrv_1;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowQrv1Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/slot_show_qr_impl/generated/api/show_qrv_1/Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Checkin", "Checkout", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Action {

    @c("checkin")
    public static final Action Checkin;

    @c("checkout")
    public static final Action Checkout;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Action[] f159506c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f159507d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f159508b;

    static {
        Action action = new Action("Checkin", 0, "checkin");
        Checkin = action;
        Action action2 = new Action("Checkout", 1, "checkout");
        Checkout = action2;
        Action[] actionArr = {action, action2};
        f159506c = actionArr;
        f159507d = kotlin.enums.c.a(actionArr);
    }

    private Action(String str, int i12, String str2) {
        this.f159508b = str2;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) f159506c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f159508b.toString();
    }
}
