package com.avito.android.util;

import android.content.res.Resources;
import android.text.Editable;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;

/* compiled from: ObjectsSummaryFormatter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/q3;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.q3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35876q3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f318979a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D5 f318980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B0 f318981c;

    public C35876q3(@Y61.k Resources resources, boolean z12) {
        this.f318979a = z12;
        this.f318980b = new D5();
        this.f318981c = new B0(resources, new E0());
    }

    public static /* synthetic */ ArrayList b(C35876q3 c35876q3, List list, SimpleParametersTree simpleParametersTree, String str, int i12) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        return c35876q3.a(list, simpleParametersTree, str, null);
    }

    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k SimpleParametersTree simpleParametersTree, @Y61.l String str, @Y61.l List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            Editable editableNewEditable = Editable.Factory.getInstance().newEditable((String) it.next());
            l0.a aVar = new l0.a();
            C35869p3 c35869p3 = new C35869p3(simpleParametersTree, list2, this, aVar);
            this.f318980b.getClass();
            D5.a(editableNewEditable, c35869p3);
            String string = editableNewEditable.toString();
            if (aVar.f406838b && str != null) {
                string = str;
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    public /* synthetic */ C35876q3(Resources resources, boolean z12, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? false : z12);
    }
}
