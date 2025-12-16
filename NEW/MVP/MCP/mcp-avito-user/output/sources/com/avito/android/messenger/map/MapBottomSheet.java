package com.avito.android.messenger.map;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MapBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/MapBottomSheet;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/map/MapBottomSheet$State;", "State", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MapBottomSheet extends com.avito.android.mvi.e<State> {

    /* compiled from: MapBottomSheet.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/map/MapBottomSheet$State;", "", "<init>", "()V", "ActionButtonState", "a", "b", "Lcom/avito/android/messenger/map/MapBottomSheet$State$a;", "Lcom/avito/android/messenger/map/MapBottomSheet$State$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MapBottomSheet.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/MapBottomSheet$State$ActionButtonState;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionButtonState {

            /* renamed from: b, reason: collision with root package name */
            public static final ActionButtonState f196431b;

            /* renamed from: c, reason: collision with root package name */
            public static final ActionButtonState f196432c;

            /* renamed from: d, reason: collision with root package name */
            public static final ActionButtonState f196433d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ ActionButtonState[] f196434e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f196435f;

            static {
                ActionButtonState actionButtonState = new ActionButtonState("ENABLED", 0);
                f196431b = actionButtonState;
                ActionButtonState actionButtonState2 = new ActionButtonState("DISABLED", 1);
                f196432c = actionButtonState2;
                ActionButtonState actionButtonState3 = new ActionButtonState("LOADING", 2);
                f196433d = actionButtonState3;
                ActionButtonState[] actionButtonStateArr = {actionButtonState, actionButtonState2, actionButtonState3};
                f196434e = actionButtonStateArr;
                f196435f = kotlin.enums.c.a(actionButtonStateArr);
            }

            public ActionButtonState() {
                throw null;
            }

            public static ActionButtonState valueOf(String str) {
                return (ActionButtonState) Enum.valueOf(ActionButtonState.class, str);
            }

            public static ActionButtonState[] values() {
                return (ActionButtonState[]) f196434e.clone();
            }
        }

        /* compiled from: MapBottomSheet.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/MapBottomSheet$State$a;", "Lcom/avito/android/messenger/map/MapBottomSheet$State;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends State {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f196436a = new a();

            public a() {
                super(null);
            }

            @k
            public final String toString() {
                return "Closed";
            }
        }

        /* compiled from: MapBottomSheet.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/MapBottomSheet$State$b;", "Lcom/avito/android/messenger/map/MapBottomSheet$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends State {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f196437a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<CharSequence> f196438b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f196439c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final ActionButtonState f196440d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f196441e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f196442f;

            public /* synthetic */ b(String str, List list, boolean z12, ActionButtonState actionButtonState, boolean z13, boolean z14, int i12, C42822w c42822w) {
                this(str, list, z12, actionButtonState, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? false : z14);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f196437a, bVar.f196437a) && L.f(this.f196438b, bVar.f196438b) && this.f196439c == bVar.f196439c && this.f196440d == bVar.f196440d && this.f196441e == bVar.f196441e && this.f196442f == bVar.f196442f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f196442f) + r.i((this.f196440d.hashCode() + r.i(H.e(this.f196437a.hashCode() * 31, 31, this.f196438b), 31, this.f196439c)) * 31, 31, this.f196441e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Expanded(title='");
                sb2.append(this.f196437a);
                sb2.append("', description=");
                sb2.append(this.f196438b);
                sb2.append(", isCloseable=");
                sb2.append(this.f196439c);
                sb2.append(", actionButtonState=");
                sb2.append(this.f196440d);
                sb2.append(", isTextEditable=");
                sb2.append(this.f196441e);
                sb2.append(", isFullScreen=");
                return r.x(sb2, this.f196442f, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(@k String str, @k List<? extends CharSequence> list, boolean z12, @k ActionButtonState actionButtonState, boolean z13, boolean z14) {
                super(null);
                this.f196437a = str;
                this.f196438b = list;
                this.f196439c = z12;
                this.f196440d = actionButtonState;
                this.f196441e = z13;
                this.f196442f = z14;
            }
        }

        public /* synthetic */ State(C42822w c42822w) {
            this();
        }

        public State() {
        }
    }

    /* compiled from: MapBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}
