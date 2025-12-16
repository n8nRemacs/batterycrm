package io.noties.markwon.core;

import io.noties.markwon.v;

/* loaded from: classes8.dex */
public abstract class CoreProps {

    /* renamed from: a, reason: collision with root package name */
    public static final v<ListItemType> f401652a = new v<>("list-item-type");

    /* renamed from: b, reason: collision with root package name */
    public static final v<Integer> f401653b = new v<>("bullet-list-item-level");

    /* renamed from: c, reason: collision with root package name */
    public static final v<Integer> f401654c = new v<>("ordered-list-item-number");

    /* renamed from: d, reason: collision with root package name */
    public static final v<Integer> f401655d = new v<>("heading-level");

    /* renamed from: e, reason: collision with root package name */
    public static final v<String> f401656e = new v<>("link-destination");

    /* renamed from: f, reason: collision with root package name */
    public static final v<Boolean> f401657f = new v<>("paragraph-is-in-tight-list");

    /* renamed from: g, reason: collision with root package name */
    public static final v<String> f401658g = new v<>("code-block-info");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ListItemType {

        /* renamed from: b, reason: collision with root package name */
        public static final ListItemType f401659b;

        /* renamed from: c, reason: collision with root package name */
        public static final ListItemType f401660c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ListItemType[] f401661d;

        static {
            ListItemType listItemType = new ListItemType("BULLET", 0);
            f401659b = listItemType;
            ListItemType listItemType2 = new ListItemType("ORDERED", 1);
            f401660c = listItemType2;
            f401661d = new ListItemType[]{listItemType, listItemType2};
        }

        public ListItemType() {
            throw null;
        }

        public static ListItemType valueOf(String str) {
            return (ListItemType) Enum.valueOf(ListItemType.class, str);
        }

        public static ListItemType[] values() {
            return (ListItemType[]) f401661d.clone();
        }
    }
}
