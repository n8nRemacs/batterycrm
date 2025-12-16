package io.reactivex.rxjava3.internal.util;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ListAddBiConsumer implements l41.c<List, Object, List> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ListAddBiConsumer[] f404824b = {new ListAddBiConsumer("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    ListAddBiConsumer EF5;

    public ListAddBiConsumer() {
        throw null;
    }

    public static ListAddBiConsumer valueOf(String str) {
        return (ListAddBiConsumer) Enum.valueOf(ListAddBiConsumer.class, str);
    }

    public static ListAddBiConsumer[] values() {
        return (ListAddBiConsumer[]) f404824b.clone();
    }

    @Override // l41.c
    public final List apply(List list, Object obj) {
        List list2 = list;
        list2.add(obj);
        return list2;
    }
}
