package com.avito.android.tariff.remote.model.edit;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TariffBanner.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner$State;", VoiceInfo.STATE, "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner$IconType;", "iconType", "", "Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction;", "actions", "<init>", "(Lcom/avito/android/tariff/remote/model/edit/TariffBanner$State;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/tariff/remote/model/edit/TariffBanner$IconType;Ljava/util/List;)V", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner$State;", "d", "()Lcom/avito/android/tariff/remote/model/edit/TariffBanner$State;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner$IconType;", "c", "()Lcom/avito/android/tariff/remote/model/edit/TariffBanner$IconType;", "Ljava/util/List;", "a", "()Ljava/util/List;", "IconType", "State", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffBanner {

    @com.google.gson.annotations.c("actions")
    @l
    private final List<TariffAlertAction> actions;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("iconType")
    @l
    private final IconType iconType;

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @k
    private final State state;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TariffBanner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/TariffBanner$IconType;", "", "(Ljava/lang/String;I)V", "CHECK", "CLOCK", "EXCLAIM", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconType {

        @com.google.gson.annotations.c("check")
        public static final IconType CHECK;

        @com.google.gson.annotations.c("clock")
        public static final IconType CLOCK;

        @com.google.gson.annotations.c("exclaim")
        public static final IconType EXCLAIM;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ IconType[] f297497b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f297498c;

        static {
            IconType iconType = new IconType("CHECK", 0);
            CHECK = iconType;
            IconType iconType2 = new IconType("CLOCK", 1);
            CLOCK = iconType2;
            IconType iconType3 = new IconType("EXCLAIM", 2);
            EXCLAIM = iconType3;
            IconType[] iconTypeArr = {iconType, iconType2, iconType3};
            f297497b = iconTypeArr;
            f297498c = kotlin.enums.c.a(iconTypeArr);
        }

        private IconType(String str, int i12) {
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) f297497b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TariffBanner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/TariffBanner$State;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "SUCCESS", "NORMAL", "WARNING", "DANGER", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        @com.google.gson.annotations.c("danger")
        public static final State DANGER;

        @com.google.gson.annotations.c(Constants.NORMAL)
        public static final State NORMAL;

        @com.google.gson.annotations.c("success")
        public static final State SUCCESS;

        @com.google.gson.annotations.c(ConstraintKt.WARNING)
        public static final State WARNING;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f297499b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f297500c;

        static {
            State state = new State("SUCCESS", 0, "success");
            SUCCESS = state;
            State state2 = new State("NORMAL", 1, Constants.NORMAL);
            NORMAL = state2;
            State state3 = new State("WARNING", 2, ConstraintKt.WARNING);
            WARNING = state3;
            State state4 = new State("DANGER", 3, "danger");
            DANGER = state4;
            State[] stateArr = {state, state2, state3, state4};
            f297499b = stateArr;
            f297500c = kotlin.enums.c.a(stateArr);
        }

        private State(String str, int i12, String str2) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f297499b.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TariffBanner(@k State state, @k String str, @k AttributedText attributedText, @l IconType iconType, @l List<? extends TariffAlertAction> list) {
        this.state = state;
        this.title = str;
        this.description = attributedText;
        this.iconType = iconType;
        this.actions = list;
    }

    @l
    public final List<TariffAlertAction> a() {
        return this.actions;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final IconType getIconType() {
        return this.iconType;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
