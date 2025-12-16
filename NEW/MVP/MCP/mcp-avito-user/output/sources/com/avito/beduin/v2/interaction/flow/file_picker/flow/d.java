package com.avito.beduin.v2.interaction.flow.file_picker.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PickerContentType.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/l;", "a", "b", "c", "d", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$a;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$b;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$c;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class d implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f337404a;

    /* compiled from: PickerContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$a;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d {
        public a() {
            this(null, 1, null);
        }

        public a(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? "audio/*" : str, null);
        }
    }

    /* compiled from: PickerContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$b;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends d {
        public b() {
            this(null, 1, null);
        }

        public b(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? "*/*" : str, null);
        }
    }

    /* compiled from: PickerContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$c;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends d {
        public c() {
            this(null, 1, null);
        }

        public c(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? "image/*" : str, null);
        }
    }

    /* compiled from: PickerContentType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d$d;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.interaction.flow.file_picker.flow.d$d, reason: collision with other inner class name */
    public static final class C10456d extends d {
        public C10456d() {
            this(null, 1, null);
        }

        public C10456d(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? "video/*" : str, null);
        }
    }

    public d(String str, C42822w c42822w) {
        this.f337404a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return L.f(this.f337404a, ((d) obj).f337404a);
    }

    public final int hashCode() {
        return this.f337404a.hashCode();
    }
}
