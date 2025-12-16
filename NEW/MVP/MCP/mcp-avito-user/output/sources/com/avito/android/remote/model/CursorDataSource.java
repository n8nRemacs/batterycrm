package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import android.database.Cursor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CursorDataSource.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001)B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0012J0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010(\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010 ¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/CursorDataSource;", "T", "Lcom/avito/android/remote/model/CloseableDataSource;", "Landroid/database/Cursor;", "cursor", "Lcom/avito/android/remote/model/CursorDataSource$CursorDataRetriever;", "retriever", "<init>", "(Landroid/database/Cursor;Lcom/avito/android/remote/model/CursorDataSource$CursorDataRetriever;)V", "component1", "()Landroid/database/Cursor;", "component2", "()Lcom/avito/android/remote/model/CursorDataSource$CursorDataRetriever;", "Lkotlin/G0;", "setCursor", "(Landroid/database/Cursor;)V", "", "isEmpty", "()Z", "", "position", "getItem", "(I)Ljava/lang/Object;", "close", "()V", "isClosed", "copy", "(Landroid/database/Cursor;Lcom/avito/android/remote/model/CursorDataSource$CursorDataRetriever;)Lcom/avito/android/remote/model/CursorDataSource;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Landroid/database/Cursor;", "Lcom/avito/android/remote/model/CursorDataSource$CursorDataRetriever;", "getCount", "count", "CursorDataRetriever", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CursorDataSource<T> implements CloseableDataSource<T> {

    @k
    private Cursor cursor;

    @k
    private final CursorDataRetriever<T> retriever;

    /* compiled from: CursorDataSource.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/CursorDataSource$CursorDataRetriever;", "T", "", "retrieve", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)Ljava/lang/Object;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CursorDataRetriever<T> {
        T retrieve(@k Cursor cursor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CursorDataSource(@k Cursor cursor, @k CursorDataRetriever<? extends T> cursorDataRetriever) {
        this.cursor = cursor;
        this.retriever = cursorDataRetriever;
    }

    /* renamed from: component1, reason: from getter */
    private final Cursor getCursor() {
        return this.cursor;
    }

    private final CursorDataRetriever<T> component2() {
        return this.retriever;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CursorDataSource copy$default(CursorDataSource cursorDataSource, Cursor cursor, CursorDataRetriever cursorDataRetriever, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cursor = cursorDataSource.cursor;
        }
        if ((i12 & 2) != 0) {
            cursorDataRetriever = cursorDataSource.retriever;
        }
        return cursorDataSource.copy(cursor, cursorDataRetriever);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @k
    public final CursorDataSource<T> copy(@k Cursor cursor, @k CursorDataRetriever<? extends T> retriever) {
        return new CursorDataSource<>(cursor, retriever);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CursorDataSource)) {
            return false;
        }
        CursorDataSource cursorDataSource = (CursorDataSource) other;
        return L.f(this.cursor, cursorDataSource.cursor) && L.f(this.retriever, cursorDataSource.retriever);
    }

    @Override // com.avito.android.remote.model.CloseableDataSource, UV0.a
    public int getCount() {
        return this.cursor.getCount();
    }

    @Override // com.avito.android.remote.model.CloseableDataSource, UV0.a
    public T getItem(int position) {
        if (this.cursor.moveToPosition(position)) {
            return this.retriever.retrieve(this.cursor);
        }
        throw new IllegalStateException("Failed to move cursor " + this.cursor + " to position " + position);
    }

    public int hashCode() {
        return this.retriever.hashCode() + (this.cursor.hashCode() * 31);
    }

    public final boolean isClosed() {
        return this.cursor.isClosed();
    }

    @Override // com.avito.android.remote.model.CloseableDataSource, UV0.a
    public boolean isEmpty() {
        return this.cursor.getCount() == 0;
    }

    public final void setCursor(@k Cursor cursor) {
        Cursor cursor2 = this.cursor;
        if (cursor2 != cursor) {
            cursor2.close();
        }
        this.cursor = cursor;
    }

    @k
    public String toString() {
        return "CursorDataSource(cursor=" + this.cursor + ", retriever=" + this.retriever + ')';
    }
}
