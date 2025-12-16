package com.avito.android.ui.widget.tagged_input;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TagsViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/m;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/ui/widget/tagged_input/l;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class m extends M0 implements l {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final a f304731E = new a();

    /* compiled from: TagsViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/m$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f304732a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f304733b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f304734c = new LinkedHashMap();

        @Y61.k
        public final C23038g0<List<TagItem>> a(@Y61.k String str) {
            LinkedHashMap linkedHashMap = this.f304734c;
            Object c23038g0 = linkedHashMap.get(str);
            if (c23038g0 == null) {
                c23038g0 = new C23038g0();
                linkedHashMap.put(str, c23038g0);
            }
            return (C23038g0) c23038g0;
        }

        @Y61.k
        public final D<TagItem> b(@Y61.k String str) {
            LinkedHashMap linkedHashMap = this.f304733b;
            Object d12 = linkedHashMap.get(str);
            if (d12 == null) {
                d12 = new D();
                linkedHashMap.put(str, d12);
            }
            return (D) d12;
        }

        @Y61.k
        public final C23038g0<Boolean> c(@Y61.k String str) {
            LinkedHashMap linkedHashMap = this.f304732a;
            Object c23038g0 = linkedHashMap.get(str);
            if (c23038g0 == null) {
                c23038g0 = new C23038g0();
                linkedHashMap.put(str, c23038g0);
            }
            return (C23038g0) c23038g0;
        }
    }

    @Override // com.avito.android.ui.widget.tagged_input.l
    public final void m3(@Y61.k String str, @Y61.l List<TagItem> list) {
        a aVar = this.f304731E;
        if (list == null || list.isEmpty()) {
            aVar.a(str).setValue(null);
            aVar.c(str).setValue(Boolean.FALSE);
        } else {
            aVar.a(str).setValue(new ArrayList(list));
            aVar.c(str).setValue(Boolean.valueOf(!r5.isEmpty()));
        }
    }
}
