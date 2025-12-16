package com.avito.android.html_formatter;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: FormatChange.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_formatter/FormatChange;", "", "Type", "Lcom/avito/android/html_formatter/a;", "Lcom/avito/android/html_formatter/b;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class FormatChange {

    /* renamed from: a, reason: collision with root package name */
    public final int f164158a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f164159b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FormatChange.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/FormatChange$Type;", "", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f164160b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f164161c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f164162d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f164163e;

        static {
            Type type = new Type("ADD", 0);
            f164160b = type;
            Type type2 = new Type("REMOVE", 1);
            f164161c = type2;
            Type[] typeArr = {type, type2};
            f164162d = typeArr;
            f164163e = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f164162d.clone();
        }
    }

    public FormatChange(int i12, Type type, C42822w c42822w) {
        this.f164158a = i12;
        this.f164159b = type;
    }
}
