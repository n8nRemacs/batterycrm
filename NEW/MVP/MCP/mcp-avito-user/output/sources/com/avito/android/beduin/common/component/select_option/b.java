package com.avito.android.beduin.common.component.select_option;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectOptionComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/b;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/select_option/BeduinSelectOptionModel;", "Lcom/avito/android/beduin/common/component/select_option/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.android.beduin.common.component.h<BeduinSelectOptionModel, g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSelectOptionModel f102470e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f102471f;

    /* compiled from: BeduinSelectOptionComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f102472a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102473b = Collections.singletonList("selectOption");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinSelectOptionModel> f102474c = BeduinSelectOptionModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinSelectOptionModel> S() {
            return f102474c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102473b;
        }
    }

    /* compiled from: BeduinSelectOptionComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.select_option.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3070b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102475a;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.WITH_BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.NO_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102475a = iArr;
        }
    }

    public b(@k BeduinSelectOptionModel beduinSelectOptionModel, @k lj.e eVar) {
        this.f102470e = beduinSelectOptionModel;
        this.f102471f = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102470e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        g gVar = new g(viewGroup.getContext(), null, 0, 6, null);
        gVar.setId(View.generateViewId());
        gVar.setLayoutParams(layoutParams);
        return gVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Object next;
        final g gVar = (g) view;
        BeduinSelectOptionModel beduinSelectOptionModel = this.f102470e;
        gVar.setTitle(beduinSelectOptionModel.getTitle());
        Iterator<T> it = beduinSelectOptionModel.getOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Option) next).getId(), beduinSelectOptionModel.getSelectedOptionId())) {
                    break;
                }
            }
        }
        Option option = (Option) next;
        String name = option != null ? option.getName() : null;
        if (name == null) {
            name = "";
        }
        gVar.setSelectedText(name);
        gVar.setBackground(beduinSelectOptionModel.getStyle());
        gVar.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.beduin.common.component.select_option.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Context context = gVar.getContext();
                b bVar = this.f102468b;
                BeduinSelectOptionModel beduinSelectOptionModel2 = bVar.f102470e;
                com.avito.android.lib.util.g.a(new com.avito.android.beduin.common.component.select_option.dialog.h(context, beduinSelectOptionModel2.getTitle(), beduinSelectOptionModel2.getSelectedOptionId(), beduinSelectOptionModel2.getOptions(), new c(bVar)).f102496f);
            }
        });
        Style style = beduinSelectOptionModel.getStyle();
        int i12 = style == null ? -1 : C3070b.f102475a[style.ordinal()];
        if (i12 == 1) {
            D6.c(gVar, 0, null, 0, null, 10);
            G0 g02 = G0.f406611a;
        } else if (i12 != 2) {
            D6.c(gVar, Integer.valueOf(y6.b(16)), null, Integer.valueOf(y6.b(16)), null, 10);
            G0 g03 = G0.f406611a;
        } else {
            D6.c(gVar, Integer.valueOf(y6.b(16)), null, Integer.valueOf(y6.b(16)), null, 10);
            G0 g04 = G0.f406611a;
        }
    }
}
