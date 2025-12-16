package com.avito.android.ui.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import kotlin.Metadata;

/* compiled from: ListViewAppendingAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/adapter/o;", "Landroid/widget/BaseAdapter;", "Lcom/avito/android/ui/adapter/a;", "a", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o extends BaseAdapter implements com.avito.android.ui.adapter.a {

    /* compiled from: ListViewAppendingAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/adapter/o$a;", "Landroid/database/DataSetObserver;", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            throw null;
        }
    }

    @Override // android.widget.Adapter, com.avito.android.ui.adapter.a
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    @Y61.l
    public final Object getItem(int i12) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i12) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i12) {
        throw null;
    }

    @Override // android.widget.Adapter
    @Y61.l
    public final View getView(int i12, @Y61.l View view, @Y61.l ViewGroup viewGroup) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i12) {
        throw null;
    }
}
