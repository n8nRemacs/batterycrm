package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: DivViewVisitor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class x {
    public static final void a(@Y61.k w wVar, @Y61.k View view) {
        if (view instanceof y) {
            wVar.p((y) view);
            Iterator itA = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m0 = (C22833m0) itA;
                if (!c22833m0.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m0.next());
                }
            }
        } else if (view instanceof f) {
            wVar.b((f) view);
            Iterator itA2 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m02 = (C22833m0) itA2;
                if (!c22833m02.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m02.next());
                }
            }
        } else if (view instanceof h) {
            wVar.d((h) view);
            Iterator itA3 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m03 = (C22833m0) itA3;
                if (!c22833m03.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m03.next());
                }
            }
        } else if (view instanceof l) {
            wVar.g((l) view);
            Iterator itA4 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m04 = (C22833m0) itA4;
                if (!c22833m04.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m04.next());
                }
            }
        } else if (view instanceof n) {
            wVar.i((n) view);
            Iterator itA5 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m05 = (C22833m0) itA5;
                if (!c22833m05.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m05.next());
                }
            }
        } else if (view instanceof o) {
            wVar.j((o) view);
            Iterator itA6 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m06 = (C22833m0) itA6;
                if (!c22833m06.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m06.next());
                }
            }
        } else if (view instanceof t) {
            wVar.n((t) view);
            Iterator itA7 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m07 = (C22833m0) itA7;
                if (!c22833m07.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m07.next());
                }
            }
        } else if (view instanceof com.yandex.div.internal.widget.tabs.z) {
            wVar.q((com.yandex.div.internal.widget.tabs.z) view);
            Iterator itA8 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m08 = (C22833m0) itA8;
                if (!c22833m08.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m08.next());
                }
            }
        } else {
            if (view instanceof q) {
                wVar.l((q) view);
                return;
            }
            if (view instanceof g) {
                wVar.c((g) view);
                return;
            }
            if (view instanceof i) {
                wVar.e((i) view);
                return;
            }
            if (view instanceof k) {
                wVar.f((k) view);
                return;
            }
            if (view instanceof m) {
                wVar.h((m) view);
                return;
            }
            if (view instanceof r) {
                wVar.m((r) view);
                return;
            }
            if (view instanceof p) {
                wVar.k((p) view);
                return;
            }
            if (view instanceof v) {
                wVar.o((v) view);
                return;
            }
            wVar.a(view);
            if (!(view instanceof ViewGroup)) {
                return;
            }
            Iterator itA9 = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m09 = (C22833m0) itA9;
                if (!c22833m09.hasNext()) {
                    return;
                } else {
                    a(wVar, (View) c22833m09.next());
                }
            }
        }
    }
}
