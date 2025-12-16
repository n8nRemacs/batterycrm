package io.reactivex.rxjava3.internal.operators.maybe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MaybeToPublisher implements l41.o<io.reactivex.rxjava3.core.w<Object>, org.reactivestreams.c<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MaybeToPublisher[] f403168b = {new MaybeToPublisher("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    MaybeToPublisher EF5;

    public MaybeToPublisher() {
        throw null;
    }

    public static MaybeToPublisher valueOf(String str) {
        return (MaybeToPublisher) Enum.valueOf(MaybeToPublisher.class, str);
    }

    public static MaybeToPublisher[] values() {
        return (MaybeToPublisher[]) f403168b.clone();
    }

    @Override // l41.o
    public final org.reactivestreams.c<Object> apply(io.reactivex.rxjava3.core.w<Object> wVar) {
        return new q0(wVar);
    }
}
