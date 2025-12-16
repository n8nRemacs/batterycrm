package com.avito.android.publish.slots.generate_text_buttons.item;

import JO.i;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: GenerateTextButtonsItem.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem;", "LJO/i;", "Lcom/avito/conveyor_item/a;", "a", "State", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GenerateTextButtonsItem implements i, com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243977b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f243978c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f243979d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f243980e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final State f243981f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f243982g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GenerateTextButtonsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$State;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f243983b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f243984c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f243985d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f243986e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f243987f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f243988g;

        static {
            State state = new State("READY_FOR_INITIAL_GENERATION", 0);
            f243983b = state;
            State state2 = new State("WAITING_INITIAL_GENERATION", 1);
            f243984c = state2;
            State state3 = new State("READY_FOR_NEXT_GENERATION", 2);
            f243985d = state3;
            State state4 = new State("WAITING_FOR_NEXT_GENERATION", 3);
            f243986e = state4;
            State[] stateArr = {state, state2, state3, state4};
            f243987f = stateArr;
            f243988g = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f243987f.clone();
        }
    }

    /* compiled from: GenerateTextButtonsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/generate_text_buttons/item/GenerateTextButtonsItem$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f243989a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f243990b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final N f243991c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k Y41.a aVar, @k String str, @k String str2) {
            this.f243989a = str;
            this.f243990b = str2;
            this.f243991c = (N) aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f243989a, aVar.f243989a) && L.f(this.f243990b, aVar.f243990b) && this.f243991c.equals(aVar.f243991c);
        }

        public final int hashCode() {
            return this.f243991c.hashCode() + H.d(this.f243989a.hashCode() * 31, 31, this.f243990b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionButton(title=");
            sb2.append(this.f243989a);
            sb2.append(", iconName=");
            sb2.append(this.f243990b);
            sb2.append(", action=");
            return C22026a.d(sb2, this.f243991c, ')');
        }
    }

    public GenerateTextButtonsItem(@k String str, @k a aVar, @k a aVar2, @k a aVar3, @k State state, @l AttributedText attributedText) {
        this.f243977b = str;
        this.f243978c = aVar;
        this.f243979d = aVar2;
        this.f243980e = aVar3;
        this.f243981f = state;
        this.f243982g = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateTextButtonsItem)) {
            return false;
        }
        GenerateTextButtonsItem generateTextButtonsItem = (GenerateTextButtonsItem) obj;
        return L.f(this.f243977b, generateTextButtonsItem.f243977b) && L.f(this.f243978c, generateTextButtonsItem.f243978c) && L.f(this.f243979d, generateTextButtonsItem.f243979d) && L.f(this.f243980e, generateTextButtonsItem.f243980e) && this.f243981f == generateTextButtonsItem.f243981f && L.f(this.f243982g, generateTextButtonsItem.f243982g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF243916b().hashCode();
    }

    @Override // JO.i
    @l
    /* renamed from: getMotivation, reason: from getter */
    public final AttributedText getF243982g() {
        return this.f243982g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243916b() {
        return this.f243977b;
    }

    public final int hashCode() {
        int iHashCode = (this.f243981f.hashCode() + ((this.f243980e.hashCode() + ((this.f243979d.hashCode() + ((this.f243978c.hashCode() + (this.f243977b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        AttributedText attributedText = this.f243982g;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GenerateTextButtonsItem(stringId=");
        sb2.append(this.f243977b);
        sb2.append(", generateTextButton=");
        sb2.append(this.f243978c);
        sb2.append(", previousTextButton=");
        sb2.append(this.f243979d);
        sb2.append(", regenerateTextButton=");
        sb2.append(this.f243980e);
        sb2.append(", state=");
        sb2.append(this.f243981f);
        sb2.append(", motivation=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f243982g, ')');
    }
}
