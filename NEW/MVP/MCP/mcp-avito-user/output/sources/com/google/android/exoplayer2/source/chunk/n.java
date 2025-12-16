package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* compiled from: MediaChunkIterator.java */
/* loaded from: classes6.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f346232a = new a();

    /* compiled from: MediaChunkIterator.java */
    public class a implements n {
        @Override // com.google.android.exoplayer2.source.chunk.n
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.n
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.n
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
