package com.yatatsu.powerwebview.rx;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PowerWebViewStateChangeEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "", "a", "State", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PowerWebViewStateChangeEvent {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f392936g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final State f392937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f392938b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f392939c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Bitmap f392940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f392941e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f392942f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PowerWebViewStateChangeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent$State;", "", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f392943b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f392944c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f392945d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f392946e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f392947f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f392948g;

        static {
            State state = new State("STARTED", 0);
            f392943b = state;
            State state2 = new State("FINISHED", 1);
            f392944c = state2;
            State state3 = new State("PROGRESS", 2);
            f392945d = state3;
            State state4 = new State("ERROR", 3);
            f392946e = state4;
            State[] stateArr = {state, state2, state3, state4};
            f392947f = stateArr;
            f392948g = c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f392947f.clone();
        }
    }

    /* compiled from: PowerWebViewStateChangeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent$a;", "", "<init>", "()V", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public PowerWebViewStateChangeEvent(@k State state, int i12, @l String str, @l Bitmap bitmap, int i13, @l String str2) {
        this.f392937a = state;
        this.f392938b = i12;
        this.f392939c = str;
        this.f392940d = bitmap;
        this.f392941e = i13;
        this.f392942f = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PowerWebViewStateChangeEvent)) {
            return false;
        }
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
        return this.f392937a == powerWebViewStateChangeEvent.f392937a && this.f392938b == powerWebViewStateChangeEvent.f392938b && L.f(this.f392939c, powerWebViewStateChangeEvent.f392939c) && L.f(this.f392940d, powerWebViewStateChangeEvent.f392940d) && this.f392941e == powerWebViewStateChangeEvent.f392941e && L.f(this.f392942f, powerWebViewStateChangeEvent.f392942f);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f392938b, this.f392937a.hashCode() * 31, 31);
        String str = this.f392939c;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.f392940d;
        int iE3 = r.e(this.f392941e, (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31);
        String str2 = this.f392942f;
        return iE3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PowerWebViewStateChangeEvent(state=");
        sb2.append(this.f392937a);
        sb2.append(", progress=");
        sb2.append(this.f392938b);
        sb2.append(", url=");
        sb2.append(this.f392939c);
        sb2.append(", favicon=");
        sb2.append(this.f392940d);
        sb2.append(", errorCode=");
        sb2.append(this.f392941e);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f392942f, ')');
    }
}
