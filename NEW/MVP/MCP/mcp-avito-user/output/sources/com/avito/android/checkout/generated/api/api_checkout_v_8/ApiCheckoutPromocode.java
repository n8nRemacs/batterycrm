package com.avito.android.checkout.generated.api.api_checkout_v_8;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import vo.C49359a;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u001cB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode;", "", "Lvo/a;", "button", "", "message", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode$State;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/text/AttributedText;", "title", "value", "<init>", "(Lvo/a;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode$State;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lvo/a;", "a", "()Lvo/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode$State;", "d", "()Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode$State;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "State", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApiCheckoutPromocode {

    @c("button")
    @k
    private final C49359a button;

    @c("message")
    @l
    private final String message;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c(VoiceInfo.STATE)
    @k
    private final State state;

    @c("title")
    @k
    private final AttributedText title;

    @c("value")
    @l
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiCheckoutV8Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/checkout/generated/api/api_checkout_v_8/ApiCheckoutPromocode$State;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Normal", "Applied", "Invalid", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        @c("applied")
        public static final State Applied;

        @c("invalid")
        public static final State Invalid;

        @c(Constants.NORMAL)
        public static final State Normal;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f118325b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f118326c;

        static {
            State state = new State("Normal", 0, Constants.NORMAL);
            Normal = state;
            State state2 = new State("Applied", 1, "applied");
            Applied = state2;
            State state3 = new State("Invalid", 2, "invalid");
            Invalid = state3;
            State[] stateArr = {state, state2, state3};
            f118325b = stateArr;
            f118326c = kotlin.enums.c.a(stateArr);
        }

        private State(String str, int i12, String str2) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f118325b.clone();
        }
    }

    public ApiCheckoutPromocode(@k C49359a c49359a, @l String str, @l String str2, @k State state, @k AttributedText attributedText, @l String str3) {
        this.button = c49359a;
        this.message = str;
        this.placeholder = str2;
        this.state = state;
        this.title = attributedText;
        this.value = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49359a getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
