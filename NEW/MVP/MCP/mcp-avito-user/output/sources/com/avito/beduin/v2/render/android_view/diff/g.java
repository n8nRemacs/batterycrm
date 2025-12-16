package com.avito.beduin.v2.render.android_view.diff;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DiffOpCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/g;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g {

    /* compiled from: DiffOpCallback.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@Y61.k g gVar, int i12, @Y61.k ArrayList arrayList) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                gVar.a(i12 + i13, ((Number) arrayList.get(i13)).intValue());
            }
        }

        public static void b(@Y61.k g gVar, int i12, @Y61.k ArrayList arrayList) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                gVar.c(i12 + i13, ((Number) arrayList.get(i13)).intValue());
            }
        }
    }

    void a(int i12, int i13);

    void b(int i12, int i13);

    void c(int i12, int i13);

    void d(int i12, int i13);

    void e(int i12, @Y61.k ArrayList arrayList);

    void f(int i12, @Y61.k ArrayList arrayList);
}
