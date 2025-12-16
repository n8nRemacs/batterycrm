package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.S0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.font.C22609c0;
import androidx.compose.ui.text.font.D;
import androidx.compose.ui.text.font.S;
import androidx.compose.ui.text.font.X;
import androidx.compose.ui.text.font.Y;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: AndroidFontListTypeface.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/platform/c;", "Landroidx/compose/ui/text/platform/o;", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.ui.text.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22669c implements o {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Y f42548c;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y f42549a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f42550b;

    /* compiled from: AndroidFontListTypeface.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/platform/c$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.platform.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f42548c = new Y();
    }

    public C22669c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22669c(S s5, Context context, List list, Y y12, int i12, C42822w c42822w) {
        ArrayList arrayList = null;
        list = (i12 & 4) != 0 ? null : list;
        this.f42549a = (i12 & 8) != 0 ? f42548c : y12;
        List<D> list2 = s5.f42191h;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i13 = 0; i13 < size; i13++) {
            D d12 = list2.get(i13);
            int f42307e = d12.getF42307e();
            X.f42213b.getClass();
            if (X.a(f42307e, 0)) {
                arrayList2.add(d12);
            }
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                Q q12 = (Q) list.get(i14);
                e0 e0Var = (e0) q12.f406619b;
                int i15 = ((Z) q12.f406620c).f42219a;
                this.f42549a.getClass();
                arrayList3.add((D) C42745f0.G(Y.a(arrayList2, e0Var, i15)));
            }
            ArrayList arrayListA = E0.d.a(arrayList3);
            S0 s02 = new S0(arrayListA.size());
            arrayList = new ArrayList(arrayListA.size());
            int size3 = arrayListA.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Object obj = arrayListA.get(i16);
                if (s02.e((D) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        arrayList2 = arrayList != null ? arrayList : arrayList2;
        if (arrayList2.isEmpty()) {
            C50028a.c("Could not match font");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size4 = arrayList2.size();
        for (int i17 = 0; i17 < size4; i17++) {
            D d13 = (D) arrayList2.get(i17);
            try {
                p.f42580a.getClass();
                linkedHashMap.put(d13, p.a(context, d13));
            } catch (Exception unused) {
                C50028a.c("Cannot create Typeface from " + d13);
            }
        }
        this.f42550b = linkedHashMap;
    }

    @Override // androidx.compose.ui.text.platform.o
    @Y61.k
    public final Typeface a(int i12, int i13, @Y61.k e0 e0Var) {
        LinkedHashMap linkedHashMap = this.f42550b;
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        this.f42549a.getClass();
        D d12 = (D) C42745f0.G(Y.a(arrayList, e0Var, i12));
        if (d12 == null) {
            C50028a.d("Could not load font");
            throw new KotlinNothingValueException();
        }
        Typeface typeface = (Typeface) linkedHashMap.get(d12);
        if (typeface != null) {
            return (Typeface) C22609c0.a(i13, typeface, d12, e0Var, i12);
        }
        C50028a.d("Could not load typeface");
        throw new KotlinNothingValueException();
    }
}
