package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivAnimationInterpolator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivAnimationInterpolator;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f371286c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, DivAnimationInterpolator> f371287d = a.f371296l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f371295b;

    /* compiled from: DivAnimationInterpolator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAnimationInterpolator;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, DivAnimationInterpolator> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371296l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final DivAnimationInterpolator invoke(String str) {
            String str2 = str;
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (str2.equals("linear")) {
                return divAnimationInterpolator;
            }
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            if (str2.equals("ease")) {
                return divAnimationInterpolator2;
            }
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            if (str2.equals("ease_in")) {
                return divAnimationInterpolator3;
            }
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            if (str2.equals("ease_out")) {
                return divAnimationInterpolator4;
            }
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            if (str2.equals("ease_in_out")) {
                return divAnimationInterpolator5;
            }
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            if (str2.equals("spring")) {
                return divAnimationInterpolator6;
            }
            return null;
        }
    }

    /* compiled from: DivAnimationInterpolator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivAnimationInterpolator$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    DivAnimationInterpolator(String str) {
        this.f371295b = str;
    }
}
