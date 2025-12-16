package com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api21FeesFeesMethodsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription;", "", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription$State;", VoiceInfo.STATE, "", "title", "<init>", "(Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription$State;Ljava/lang/String;)V", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription$State;", "a", "()Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription$State;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "State", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OkResponseSuccessOkBarDescription {

    @c(VoiceInfo.STATE)
    @k
    private final State state;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api21FeesFeesMethodsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription$State;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Normal", "Warning", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        @c(Constants.NORMAL)
        public static final State Normal;

        @c(ConstraintKt.WARNING)
        public static final State Warning;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f157957b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f157958c;

        static {
            State state = new State("Normal", 0, Constants.NORMAL);
            Normal = state;
            State state2 = new State("Warning", 1, ConstraintKt.WARNING);
            Warning = state2;
            State[] stateArr = {state, state2};
            f157957b = stateArr;
            f157958c = kotlin.enums.c.a(stateArr);
        }

        private State(String str, int i12, String str2) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f157957b.clone();
        }
    }

    public OkResponseSuccessOkBarDescription(@k State state, @k String str) {
        this.state = state;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
