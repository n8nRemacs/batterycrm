package com.avito.android.vas_performance.ui.items.applied_services;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServiceItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/applied_services/AppliedServiceItem;", "Lcom/avito/conveyor_item/a;", "State", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppliedServiceItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321549b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321550c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f321551d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Image f321552e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f321553f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Action f321554g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final State f321555h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Action f321556i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<com.avito.android.vas_performance.ui.items.stickers.a> f321557j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppliedServiceItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/applied_services/AppliedServiceItem$State;", "", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f321558c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f321559d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f321560e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f321561f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f321562g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f321563h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f321564b;

        /* compiled from: AppliedServiceItem.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/applied_services/AppliedServiceItem$State$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            State state = new State("APPLIED", 0, "applied");
            State state2 = new State("PLANNED", 1, "planned");
            f321559d = state2;
            State state3 = new State("CANCELLED", 2, "cancelled");
            f321560e = state3;
            State state4 = new State("NONE", 3, "");
            f321561f = state4;
            State[] stateArr = {state, state2, state3, state4};
            f321562g = stateArr;
            f321563h = kotlin.enums.c.a(stateArr);
            f321558c = new a(null);
        }

        public State(String str, int i12, String str2) {
            this.f321564b = str2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f321562g.clone();
        }
    }

    public AppliedServiceItem(@k String str, @k String str2, @k String str3, @k Image image, @l String str4, @l Action action, @k State state, @l Action action2, @l List<com.avito.android.vas_performance.ui.items.stickers.a> list) {
        this.f321549b = str;
        this.f321550c = str2;
        this.f321551d = str3;
        this.f321552e = image;
        this.f321553f = str4;
        this.f321554g = action;
        this.f321555h = state;
        this.f321556i = action2;
        this.f321557j = list;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return getF294909b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294909b() {
        return this.f321549b;
    }

    public /* synthetic */ AppliedServiceItem(String str, String str2, String str3, Image image, String str4, Action action, State state, Action action2, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, image, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : action, (i12 & 64) != 0 ? State.f321561f : state, (i12 & 128) != 0 ? null : action2, (i12 & 256) != 0 ? null : list);
    }
}
