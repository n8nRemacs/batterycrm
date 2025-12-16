package com.avito.android.search.filter.adapter.category_group;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: CategoryGroupDialogView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/e;", "Lcom/avito/android/search/filter/adapter/category_group/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.adapter.category_group.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34541e implements InterfaceC34538b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Chips f262056a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f262057b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f262058c;

    /* compiled from: CategoryGroupDialogView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.search.filter.adapter.category_group.e$a */
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            final String str2 = str;
            boolean zK2 = C43066x.K(str2);
            final C34541e c34541e = C34541e.this;
            if (zK2) {
                c34541e.f262056a.post(new com.avito.android.publish.screen.objects.view.actions.h(c34541e, 10));
            } else {
                c34541e.f262056a.post(new Runnable() { // from class: com.avito.android.search.filter.adapter.category_group.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C34541e c34541e2 = c34541e;
                        Iterable iterable = (Iterable) c34541e2.f262058c;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            C c12 = (C) obj;
                            String str3 = c12.f262040d;
                            String str4 = str2;
                            if (!C43066x.q(str3, str4, false)) {
                                String str5 = c12.f262040d;
                                if (!C43066x.q(str5.length() > 0 ? Character.toLowerCase(str5.charAt(0)) + str5.substring(1) : str5, str4, false)) {
                                    if (str4.length() > 0) {
                                        str4 = ((Object) C43044a.e(str4.charAt(0))) + str4.substring(1);
                                    }
                                    if (C43066x.q(str5, str4, false)) {
                                    }
                                }
                            }
                            arrayList.add(obj);
                        }
                        c34541e2.f262056a.setData(arrayList);
                    }
                });
            }
            return G0.f406611a;
        }
    }

    public C34541e(@Y61.k View view) {
        this.f262056a = (Chips) view.findViewById(R.id.chips);
        Input input = (Input) view.findViewById(R.id.search_input);
        this.f262057b = input;
        this.f262058c = C42784z0.f406748b;
        input.b(new com.avito.android.lib.design.input.s(input.m53getText(), new a()));
        input.setClearButton(false);
    }
}
