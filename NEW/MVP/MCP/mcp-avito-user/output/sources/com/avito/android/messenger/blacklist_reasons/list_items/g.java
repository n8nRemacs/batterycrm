package com.avito.android.messenger.blacklist_reasons.list_items;

import android.text.Editable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.blacklist_reasons.list_items.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputItemBlueprint.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/g;", "LTV0/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g extends TV0.e {

    /* compiled from: InputItemBlueprint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: InputItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/g$b;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements g {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Input f186624b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public Y41.l<? super CharSequence, G0> f186625c;

        /* compiled from: InputItemBlueprint.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<String, G0> {
            public a() {
                super(1);
            }

            @Override // Y41.l
            public final G0 invoke(String str) {
                String str2 = str;
                Y41.l<? super CharSequence, G0> lVar = b.this.f186625c;
                if (lVar != null) {
                    lVar.invoke(str2);
                }
                return G0.f406611a;
            }
        }

        public b(@Y61.k View view) {
            super(view);
            Input input = (Input) view.findViewById(R.id.messenger_blacklist_reasons_input);
            this.f186624b = input;
            com.avito.android.lib.design.input.n.c(input, new a());
        }

        @Override // com.avito.android.messenger.blacklist_reasons.list_items.g
        public final void ww(@Y61.k a.b bVar, @Y61.k Y41.l<? super CharSequence, G0> lVar) {
            Input input = this.f186624b;
            Editable editableM53getText = input.m53getText();
            if ((editableM53getText != null ? editableM53getText.length() : 0) == 0) {
                Input.t(input, bVar.f186617b, false, 4);
            }
            this.f186625c = lVar;
        }
    }

    void ww(@Y61.k a.b bVar, @Y61.k Y41.l<? super CharSequence, G0> lVar);
}
