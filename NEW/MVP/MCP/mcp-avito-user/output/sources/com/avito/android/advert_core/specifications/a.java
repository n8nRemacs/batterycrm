package com.avito.android.advert_core.specifications;

import Y61.k;
import com.avito.android.remote.model.ModelSpecifications;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpecificationData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_core/specifications/a;", "", "a", "b", "c", "Lcom/avito/android/advert_core/specifications/a$a;", "Lcom/avito/android/advert_core/specifications/a$b;", "Lcom/avito/android/advert_core/specifications/a$c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f84389a;

    /* compiled from: SpecificationData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/specifications/a$a;", "Lcom/avito/android/advert_core/specifications/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.specifications.a$a, reason: collision with other inner class name */
    public static final class C2501a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ModelSpecifications.Block f84390b;

        public C2501a(@k ModelSpecifications.Block block) {
            super(1, null);
            this.f84390b = block;
        }
    }

    /* compiled from: SpecificationData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/specifications/a$b;", "Lcom/avito/android/advert_core/specifications/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ModelSpecifications.Scheme f84391b;

        public b(@k ModelSpecifications.Scheme scheme, int i12) {
            super(i12, null);
            this.f84391b = scheme;
        }
    }

    /* compiled from: SpecificationData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/specifications/a$c;", "Lcom/avito/android/advert_core/specifications/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f84392b;

        public c(@k String str, int i12) {
            super(i12, null);
            this.f84392b = str;
        }
    }

    public a(int i12, C42822w c42822w) {
        this.f84389a = i12;
    }
}
