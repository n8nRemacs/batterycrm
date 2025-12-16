package com.avito.android.important_addresses_selection.deeplink;

import Ju.InterfaceC14249c;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionLinkResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/l;", "", "<init>", "()V", "a", "b", "c", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class l {

    /* compiled from: ImportantAddressesSelectionLinkResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/l$a;", "LJu/c$b;", "<init>", "()V", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f169757b = new a();
    }

    /* compiled from: ImportantAddressesSelectionLinkResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/l$b;", "LJu/c$a;", "<init>", "()V", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f169758b = new b();
    }

    /* compiled from: ImportantAddressesSelectionLinkResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/l$c;", "LJu/c$b;", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ImportantAddressesData f169759b;

        public c(@Y61.k ImportantAddressesData importantAddressesData) {
            this.f169759b = importantAddressesData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f169759b, ((c) obj).f169759b);
        }

        public final int hashCode() {
            return this.f169759b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ImportantAddressesSelectionSuccess(importantAddressesData=" + this.f169759b + ')';
        }
    }

    public /* synthetic */ l(C42822w c42822w) {
        this();
    }

    public l() {
    }
}
