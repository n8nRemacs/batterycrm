package com.avito.konveyor.item_visibility_tracker;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/b;", "", "b", "c", "d", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/b$b;", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.konveyor.item_visibility_tracker.b$b, reason: collision with other inner class name */
    public interface InterfaceC10495b {
        /* renamed from: getTrackId */
        long getF272855q();
    }

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/b$c;", "T", "LUV0/a;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<T> extends UV0.a<T> {
        l1 b(int i12);
    }

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/b$d;", "", "<init>", "()V", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f338532a = new d();

        public static boolean a(@k Rect rect, @k Rect rect2, float f12) {
            if (f12 == -1.0f) {
                if (rect.top <= 0) {
                    return true;
                }
            } else if (f12 != -2.0f) {
                int iHeight = rect.height() * rect.width();
                float f13 = 0.0f;
                if (iHeight != 0) {
                    int iMax = Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left));
                    int iMax2 = Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top));
                    if (iMax >= 0.0f && iMax2 >= 0.0f) {
                        f13 = (iMax * iMax2) / iHeight;
                    }
                }
                if (f13 >= f12) {
                    return true;
                }
            } else if (rect.top <= 0 || rect.bottom <= rect2.bottom) {
                return true;
            }
            return false;
        }
    }

    void a(@k RecyclerView recyclerView, @l Rect rect);

    void b(int i12, int i13, int i14, int i15);

    void c(@k UV0.a<?> aVar);

    void d(@l Y41.a<Rect> aVar);

    @l
    Bundle d0();

    @k
    io.reactivex.rxjava3.subjects.b<G0> e();

    boolean f();

    void g(@k RecyclerView recyclerView);

    @k
    List<WV0.a> getFilters();

    void h();

    @k
    Rect i();
}
