package com.avito.android.remote.model;

import UV0.b;
import Y61.k;
import Z41.a;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: IterableParameters.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/ParametersTreeIterator;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "LUV0/b;", "tree", "<init>", "(LUV0/b;)V", "", "hasNext", "()Z", "next", "()Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "LUV0/b;", "", "index", "I", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParametersTreeIterator implements Iterator<ParameterSlot>, a {
    private int index;

    @k
    private final b<ParameterSlot> tree;

    public ParametersTreeIterator(@k b<ParameterSlot> bVar) {
        this.tree = bVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.tree.getCount() > this.index;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @k
    public ParameterSlot next() {
        if (hasNext()) {
            b<ParameterSlot> bVar = this.tree;
            int i12 = this.index;
            this.index = i12 + 1;
            return bVar.getItem(i12);
        }
        throw new NoSuchElementException("count=" + this.tree.getCount() + " but index=" + this.index);
    }
}
