package com.avito.android.photo_picker;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_picker.FlashMode;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import l41.InterfaceC43543a;
import n41.InterfaceC44186c;

/* compiled from: PhotoPickerViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel;", "Landroidx/lifecycle/M0;", "a", "State", "b", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoPickerViewModel extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33243e f218813E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f218814J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.b0 f218815K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.computer_vision.a f218816L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f218817M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30978i f218818N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory.PhotoPickerMode f218819O;

    /* renamed from: P, reason: collision with root package name */
    public final int f218820P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public State f218821Q = State.f218834b;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f218822R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f218823S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f218824T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<a> f218825U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f218826V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> f218827W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> f218828X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public ArrayList f218829Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public FlashMode f218830Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f218831a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f218832b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<b> f218833c0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$State;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f218834b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f218835c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f218836d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f218837e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f218838f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f218839g;

        /* renamed from: h, reason: collision with root package name */
        public static final State f218840h;

        /* renamed from: i, reason: collision with root package name */
        public static final State f218841i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ State[] f218842j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f218843k;

        static {
            State state = new State("INITIAL", 0);
            f218834b = state;
            State state2 = new State("GALLERY", 1);
            f218835c = state2;
            State state3 = new State("CAMERA", 2);
            f218836d = state3;
            State state4 = new State("EDIT_FROM_GALLERY", 3);
            f218837e = state4;
            State state5 = new State("EDIT_FROM_CAMERA", 4);
            f218838f = state5;
            State state6 = new State("EDIT_SELECTED", 5);
            f218839g = state6;
            State state7 = new State("EDIT_SELECTED_FROM_GALLERY", 6);
            f218840h = state7;
            State state8 = new State("EDIT_SELECTED_FROM_CAMERA", 7);
            f218841i = state8;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8};
            f218842j = stateArr;
            f218843k = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f218842j.clone();
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$a;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$b;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$c;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$d;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$e;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$f;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$g;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$h;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$a;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.PhotoPickerViewModel$a$a, reason: collision with other inner class name */
        public static final class C6570a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6570a f218844a = new C6570a();

            public C6570a() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$b;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList f218845a;

            public b(@Y61.k ArrayList arrayList) {
                super(null);
                this.f218845a = arrayList;
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$c;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f218846a;

            public c(@Y61.k String str) {
                super(null);
                this.f218846a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f218846a, ((c) obj).f218846a);
            }

            public final int hashCode() {
                return this.f218846a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ToEditPhotoScreen(photoId="), this.f218846a, ')');
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$d;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f218847a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$e;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f218848a = new e();

            public e() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$f;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f218849a = new f();

            public f() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$g;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f218850a;

            public g(boolean z12) {
                super(null);
                this.f218850a = z12;
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a$h;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class h extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final h f218851a = new h();

            public h() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$a;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$b;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$c;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$d;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$e;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$f;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$a;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f218852a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$b;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.PhotoPickerViewModel$b$b, reason: collision with other inner class name */
        public static final class C6571b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6571b f218853a = new C6571b();

            public C6571b() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$c;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f218854a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$d;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f218855a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$e;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f218856a;

            public e(int i12) {
                super(null);
                this.f218856a = i12;
            }
        }

        /* compiled from: PhotoPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$b$f;", "Lcom/avito/android/photo_picker/PhotoPickerViewModel$b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f218857a = new f();

            public f() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f218834b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state2 = State.f218834b;
                iArr[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                State state3 = State.f218834b;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                State state4 = State.f218834b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                State state5 = State.f218834b;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/photo_picker/SelectedPhoto;", "invoke", "(Lcom/avito/android/photo_picker/SelectedPhoto;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<SelectedPhoto, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f218858l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(SelectedPhoto selectedPhoto) {
            return Boolean.valueOf(selectedPhoto.f218867c == PhotoSource.f216295e);
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            PhotoPickerViewModel photoPickerViewModel = PhotoPickerViewModel.this;
            photoPickerViewModel.f218833c0.setValue(b.C6571b.f218853a);
            photoPickerViewModel.f218825U.setValue(a.d.f218847a);
            V2.f318762a.a("DEFAULT_TAG", "Can't save photos to db", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            PhotoPickerViewModel photoPickerViewModel = PhotoPickerViewModel.this;
            photoPickerViewModel.f218833c0.setValue(b.C6571b.f218853a);
            photoPickerViewModel.f218825U.setValue(a.e.f218848a);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Landroid/net/Uri;", "", "<name for destructuring parameter 0>", "Lcom/avito/android/photo_picker/SelectedPhoto;", "apply", "(Lkotlin/Q;)Lcom/avito/android/photo_picker/SelectedPhoto;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SelectedPhoto f218861b;

        public g(SelectedPhoto selectedPhoto) {
            this.f218861b = selectedPhoto;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            Uri uri = (Uri) ((kotlin.Q) obj).f406619b;
            return SelectedPhoto.a(this.f218861b, uri, uri, null, 118);
        }
    }

    public PhotoPickerViewModel(@Y61.k InterfaceC33243e interfaceC33243e, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.analytics.b0 b0Var, @Y61.k com.avito.android.computer_vision.a aVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k InterfaceC30978i interfaceC30978i, @Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, int i12) {
        this.f218813E = interfaceC33243e;
        this.f218814J = interfaceC35745a5;
        this.f218815K = b0Var;
        this.f218816L = aVar;
        this.f218817M = interfaceC35863o4;
        this.f218818N = interfaceC30978i;
        this.f218819O = photoPickerMode;
        this.f218820P = i12;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f218822R = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f218823S = cVar2;
        this.f218824T = new io.reactivex.rxjava3.disposables.c();
        this.f218825U = new com.avito.android.util.architecture_components.D<>();
        this.f218827W = new ArrayList<>(i12);
        this.f218828X = new ArrayList<>(i12);
        this.f218829Y = new ArrayList();
        this.f218830Z = FlashMode.Off.f218749c;
        this.f218831a0 = cVar;
        this.f218832b0 = cVar2;
        this.f218833c0 = new C23038g0<>();
        interfaceC30978i.E0();
    }

    public static /* synthetic */ int Be(PhotoPickerViewModel photoPickerViewModel, Uri uri, PhotoSource photoSource, String str, int i12) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        return photoPickerViewModel.Ae(uri, photoSource, str, null);
    }

    public final int Ae(@Y61.k Uri uri, @Y61.k PhotoSource photoSource, @Y61.l String str, @Y61.l String str2) {
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = this.f218819O;
        boolean z12 = photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop;
        InterfaceC35863o4 interfaceC35863o4 = this.f218817M;
        if (z12) {
            this.f218829Y.add(new SelectedPhoto(uri, photoSource, str == null ? interfaceC35863o4.a() : str, null, null, str2, null, 88, null));
            return this.f218829Y.size();
        }
        if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) {
            this.f218829Y.add(new SelectedPhoto(uri, photoSource, str == null ? interfaceC35863o4.a() : str, null, null, str2, null, 88, null));
            ue();
            return this.f218829Y.size();
        }
        int size = this.f218829Y.size();
        C23038g0<b> c23038g0 = this.f218833c0;
        int i12 = this.f218820P;
        if (size >= i12) {
            c23038g0.setValue(new b.e(i12));
            return 0;
        }
        this.f218829Y.add(new SelectedPhoto(uri, photoSource, str == null ? interfaceC35863o4.a() : str, null, null, str2, null, 88, null));
        this.f218822R.accept(G0.f406611a);
        if (this.f218829Y.size() == 1 && this.f218821Q != State.f218834b) {
            c23038g0.setValue(b.c.f218854a);
        }
        return this.f218829Y.size();
    }

    public final void Ce() {
        ArrayList<SelectedPhoto> arrayList = this.f218829Y;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (SelectedPhoto selectedPhotoA : arrayList) {
            if (selectedPhotoA.f218867c == PhotoSource.f216295e) {
                selectedPhotoA = SelectedPhoto.a(selectedPhotoA, null, null, null, 125);
            }
            arrayList2.add(selectedPhotoA);
        }
        this.f218829Y = new ArrayList(arrayList2);
    }

    public final void Ee(@Y61.k Uri uri) {
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVar;
        Object next;
        Iterator it = this.f218829Y.iterator();
        while (true) {
            lVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((SelectedPhoto) next).f218866b, uri)) {
                    break;
                }
            }
        }
        v0.a(this.f218829Y).remove((SelectedPhoto) next);
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f218827W;
        Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.avito.android.photo_picker.legacy.thumbnail_list.l next2 = it2.next();
            com.avito.android.photo_picker.legacy.thumbnail_list.l lVar2 = next2;
            if (kotlin.jvm.internal.L.f(lVar2.f219905e, uri) || kotlin.jvm.internal.L.f(lVar2.f219906f, uri)) {
                lVar = next2;
                break;
            }
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVar3 = lVar;
        if (lVar3 != null) {
            this.f218813E.b(lVar3.f219881b);
        }
        Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it3 = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i12 = -1;
                break;
            }
            com.avito.android.photo_picker.legacy.thumbnail_list.l next3 = it3.next();
            if (kotlin.jvm.internal.L.f(next3.f219905e, uri) || kotlin.jvm.internal.L.f(next3.f219906f, uri)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            arrayList.remove(i12);
        }
        this.f218822R.accept(G0.f406611a);
        if (this.f218829Y.size() == 0) {
            boolean z12 = this.f218826V;
            C23038g0<b> c23038g0 = this.f218833c0;
            if (z12) {
                c23038g0.setValue(b.f.f218857a);
            } else {
                c23038g0.setValue(b.a.f218852a);
            }
        }
    }

    public final void ke() {
        if (this.f218829Y.size() > 0) {
            this.f218833c0.setValue(b.c.f218854a);
        }
    }

    public final void le() {
        C42745f0.l0(d.f218858l, this.f218829Y);
        ze();
        this.f218822R.accept(G0.f406611a);
        if (this.f218829Y.size() == 0) {
            boolean z12 = this.f218826V;
            C23038g0<b> c23038g0 = this.f218833c0;
            if (z12) {
                c23038g0.setValue(b.f.f218857a);
            } else {
                c23038g0.setValue(b.a.f218852a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void me() {
        boolean z12 = this.f218819O instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit;
        InterfaceC35745a5 interfaceC35745a5 = this.f218814J;
        io.reactivex.rxjava3.disposables.c cVar = this.f218824T;
        if (!z12) {
            ze();
            cVar.b(ne(qe(this.f218829Y)).s(interfaceC35745a5.c()).p(new F(this)).j0(interfaceC35745a5.e()).v0(G.f218755b, new H(this), new InterfaceC43543a() { // from class: com.avito.android.photo_picker.B
                @Override // l41.InterfaceC43543a
                public final void run() {
                    PhotoPickerViewModel photoPickerViewModel = this.f218737b;
                    photoPickerViewModel.f218824T.b(A1.d(io.reactivex.rxjava3.core.I.q(Boolean.valueOf(photoPickerViewModel.f218816L.e())).n(new I(photoPickerViewModel)).o(new J(photoPickerViewModel)).q(photoPickerViewModel.f218814J.e()), new K(photoPickerViewModel), new L(photoPickerViewModel)));
                }
            }));
        } else {
            this.f218833c0.setValue(b.d.f218855a);
            io.reactivex.rxjava3.internal.operators.completable.M mCommit = this.f218813E.commit();
            cVar.b(A1.d(new C41828t((mCommit instanceof InterfaceC44186c ? ((InterfaceC44186c) mCommit).f() : new io.reactivex.rxjava3.internal.operators.completable.Q(mCommit)).o(3L)).q(interfaceC35745a5.e()), new e(), new f()));
        }
    }

    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.S ne(@Y61.k ArrayList arrayList) {
        return this.f218813E.d(arrayList).n(new C(this)).s(this.f218814J.e());
    }

    public final void oe(@Y61.k String str) {
        int iOrdinal = this.f218821Q.ordinal();
        this.f218821Q = iOrdinal != 3 ? iOrdinal != 4 ? State.f218839g : State.f218841i : State.f218840h;
        this.f218815K.a(new m80.f(se(str)));
        this.f218825U.setValue(new a.c(str));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f218824T.e();
        this.f218818N.K();
        super.onCleared();
    }

    public final void pe() {
        this.f218825U.setValue(a.d.f218847a);
    }

    @Y61.k
    public final ArrayList qe(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((SelectedPhoto) it.next()).f218866b);
        }
        Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it2 = this.f218827W.iterator();
        while (it2.hasNext()) {
            com.avito.android.photo_picker.legacy.thumbnail_list.l next = it2.next();
            if (arrayList3.contains(next.f219906f)) {
                C42745f0.l0(new D(next), arrayList2);
            } else if (C42745f0.r(arrayList3, next.f219905e)) {
                C42745f0.l0(new E(next), arrayList2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final io.reactivex.rxjava3.core.I<SelectedPhoto> re(@Y61.k String str) {
        com.avito.android.photo_picker.legacy.thumbnail_list.l next;
        Object obj = null;
        NotFoundException notFoundException = new NotFoundException(str, (Throwable) (0 == true ? 1 : 0), 2, (C42822w) (0 == true ? 1 : 0));
        Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it = this.f218827W.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(next.f219881b, str)) {
                break;
            }
        }
        com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = next;
        if (lVar == null) {
            return io.reactivex.rxjava3.core.I.l(notFoundException);
        }
        Iterator it2 = this.f218829Y.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            SelectedPhoto selectedPhoto = (SelectedPhoto) next2;
            if (kotlin.jvm.internal.L.f(selectedPhoto.f218866b, lVar.f219905e) || kotlin.jvm.internal.L.f(selectedPhoto.f218866b, lVar.f219906f)) {
                obj = next2;
                break;
            }
        }
        SelectedPhoto selectedPhoto2 = (SelectedPhoto) obj;
        if (selectedPhoto2 == null) {
            return io.reactivex.rxjava3.core.I.l(notFoundException);
        }
        String str2 = selectedPhoto2.f218871g;
        if (str2 == null) {
            return io.reactivex.rxjava3.core.I.q(selectedPhoto2);
        }
        return this.f218818N.J0(str2, lVar.f219908h.f216292b).s(this.f218814J.e()).r(new g(selectedPhoto2));
    }

    @Y61.l
    public final String se(@Y61.k String str) {
        Object next;
        Iterator it = this.f218829Y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((SelectedPhoto) next).f218868d, str)) {
                break;
            }
        }
        SelectedPhoto selectedPhoto = (SelectedPhoto) next;
        if (selectedPhoto != null) {
            return selectedPhoto.f218871g;
        }
        return null;
    }

    public final void te() {
        this.f218821Q = State.f218836d;
        this.f218825U.setValue(a.C6570a.f218844a);
        this.f218815K.a(m80.b.f414341a);
    }

    public final void ue() {
        int iOrdinal = this.f218821Q.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.f218815K.a(m80.g.f414347a);
        }
        int iOrdinal2 = this.f218821Q.ordinal();
        this.f218821Q = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 6 ? iOrdinal2 != 7 ? State.f218834b : State.f218838f : State.f218837e : State.f218838f : State.f218837e;
        this.f218825U.setValue(new a.b(this.f218829Y));
    }

    public final void ve() {
        le();
        this.f218821Q = State.f218835c;
        this.f218825U.setValue(a.f.f218849a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void we(boolean z12) {
        State state;
        PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, 0 == true ? 1 : 0);
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = this.f218819O;
        if (kotlin.jvm.internal.L.f(photoPickerMode, modeAdd)) {
            ze();
            int iOrdinal = this.f218821Q.ordinal();
            if (iOrdinal == 1) {
                pe();
                return;
            }
            if (iOrdinal == 2) {
                ve();
                return;
            }
            if (iOrdinal == 3) {
                xe(z12);
                ve();
                ke();
                return;
            } else if (iOrdinal == 4) {
                xe(z12);
                te();
                ke();
                return;
            } else if (iOrdinal == 6 || iOrdinal == 7) {
                ue();
                return;
            } else {
                pe();
                return;
            }
        }
        if ((photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) && this.f218821Q == State.f218839g) {
            ue();
            return;
        }
        boolean z13 = photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f218828X;
        if (!z13) {
            if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop)) {
                pe();
                return;
            } else if (arrayList.isEmpty() || this.f218821Q != State.f218839g) {
                pe();
                return;
            } else {
                me();
                return;
            }
        }
        if (!arrayList.isEmpty() && ((state = this.f218821Q) == State.f218840h || state == State.f218841i || state == State.f218839g)) {
            me();
            return;
        }
        State state2 = this.f218821Q;
        if (state2 == State.f218840h) {
            this.f218829Y.clear();
            this.f218827W.clear();
            arrayList.clear();
            ve();
            return;
        }
        if (state2 == State.f218841i) {
            le();
            te();
        } else if (state2 == State.f218836d) {
            ve();
        } else {
            pe();
        }
    }

    public final void xe(boolean z12) {
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = this.f218828X;
        if (z12) {
            ArrayList<SelectedPhoto> arrayList2 = this.f218829Y;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            for (SelectedPhoto selectedPhoto : arrayList2) {
                arrayList3.add(new SelectedPhoto(selectedPhoto.f218866b, selectedPhoto.f218867c, selectedPhoto.f218868d, null, null, null, null, 120, null));
            }
            this.f218829Y = new ArrayList(arrayList3);
        } else {
            ArrayList<SelectedPhoto> arrayList4 = this.f218829Y;
            ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
            for (SelectedPhoto selectedPhoto2 : arrayList4) {
                Uri uri = selectedPhoto2.f218869e;
                if (uri == null) {
                    uri = selectedPhoto2.f218866b;
                }
                arrayList5.add(new SelectedPhoto(uri, selectedPhoto2.f218867c, selectedPhoto2.f218868d, null, null, null, null, 120, null));
            }
            this.f218829Y = new ArrayList(arrayList5);
            Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it = arrayList.iterator();
            while (it.hasNext()) {
                com.avito.android.photo_picker.legacy.thumbnail_list.l next = it.next();
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList6 = this.f218827W;
                Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it2 = arrayList6.iterator();
                int i12 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i12 = -1;
                        break;
                    } else if (kotlin.jvm.internal.L.f(it2.next().f219881b, next.f219881b)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1) {
                    arrayList6.set(i12, next);
                }
            }
        }
        arrayList.clear();
    }

    public final int ye(@Y61.k Uri uri) {
        ArrayList arrayList = this.f218829Y;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SelectedPhoto) it.next()).f218866b);
        }
        return arrayList2.indexOf(uri) + 1;
    }

    public final void ze() {
        ArrayList arrayList = this.f218829Y;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SelectedPhoto) it.next()).f218868d);
        }
        Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it2 = this.f218827W.iterator();
        while (it2.hasNext()) {
            String str = it2.next().f219881b;
            if (!arrayList2.contains(str)) {
                this.f218813E.b(str);
                it2.remove();
            }
        }
    }
}
