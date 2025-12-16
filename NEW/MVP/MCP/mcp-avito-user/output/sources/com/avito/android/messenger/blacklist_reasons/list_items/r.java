package com.avito.android.messenger.blacklist_reasons.list_items;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: TitleItemBlueprint.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/r;", "LTV0/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface r extends TV0.e {

    /* compiled from: TitleItemBlueprint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: TitleItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/r$b;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/r;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements r {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f186638b;

        public b(@Y61.k View view) {
            super(view);
            this.f186638b = (TextView) view.findViewById(R.id.messenger_blacklist_reasons_title);
        }

        @Override // com.avito.android.messenger.blacklist_reasons.list_items.r
        public final void Z4(@Y61.k String str) {
            this.f186638b.setText(str);
        }
    }

    void Z4(@Y61.k String str);
}
