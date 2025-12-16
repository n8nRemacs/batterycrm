package androidx.compose.ui.input.pointer;

import androidx.collection.C20204c0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InternalPointerEvent.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/k;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22333k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20204c0<C> f40257a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f40258b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40259c;

    public C22333k(@Y61.k C20204c0<C> c20204c0, @Y61.k E e12) {
        this.f40257a = c20204c0;
        this.f40258b = e12;
    }

    public final boolean a(long j12) {
        Object obj;
        ArrayList arrayList = this.f40258b.f40136a;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i12);
            if (B.a(((F) obj).f40138a, j12)) {
                break;
            }
            i12++;
        }
        F f12 = (F) obj;
        if (f12 != null) {
            return f12.f40145h;
        }
        return false;
    }
}
