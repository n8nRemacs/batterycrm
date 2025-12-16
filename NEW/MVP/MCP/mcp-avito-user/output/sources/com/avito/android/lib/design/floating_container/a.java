package com.avito.android.lib.design.floating_container;

import Y61.k;
import Y61.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FloatingContainerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/floating_container/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC5270a f179179a;

    /* compiled from: FloatingContainerState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/floating_container/a$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/lib/design/floating_container/a$a$a;", "Lcom/avito/android/lib/design/floating_container/a$a$b;", "Lcom/avito/android/lib/design/floating_container/a$a$c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.floating_container.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5270a {

        /* compiled from: FloatingContainerState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/floating_container/a$a$a;", "Lcom/avito/android/lib/design/floating_container/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.floating_container.a$a$a, reason: collision with other inner class name */
        public static final class C5271a extends AbstractC5270a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final View f179180a;

            public C5271a(@k View view) {
                super(null);
                this.f179180a = view;
            }
        }

        /* compiled from: FloatingContainerState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/floating_container/a$a$b;", "Lcom/avito/android/lib/design/floating_container/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.floating_container.a$a$b */
        public static final class b extends AbstractC5270a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UU.a f179181a;

            public b(@k UU.a aVar) {
                super(null);
                this.f179181a = aVar;
            }
        }

        /* compiled from: FloatingContainerState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/floating_container/a$a$c;", "Lcom/avito/android/lib/design/floating_container/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.floating_container.a$a$c */
        public static final class c extends AbstractC5270a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UU.a f179182a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UU.a f179183b;

            public c(@k UU.a aVar, @k UU.a aVar2) {
                super(null);
                this.f179182a = aVar;
                this.f179183b = aVar2;
            }
        }

        public /* synthetic */ AbstractC5270a(C42822w c42822w) {
            this();
        }

        public AbstractC5270a() {
        }
    }

    public a(@k AbstractC5270a abstractC5270a) {
        this.f179179a = abstractC5270a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f179179a, ((a) obj).f179179a);
    }

    public final int hashCode() {
        return this.f179179a.hashCode();
    }

    @k
    public final String toString() {
        return "FloatingContainerState(content=" + this.f179179a + ')';
    }
}
