package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ll0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final View f387565a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Map<String, View> f387566b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final View f387567a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final Map<String, View> f387568b;

        public a(@j.N View view, @j.N HashMap map) {
            this.f387567a = view;
            this.f387568b = map;
        }

        @j.N
        public final a c(@j.P TextView textView) {
            this.f387568b.put("call_to_action", textView);
            return this;
        }

        @j.N
        public final a d(@j.P TextView textView) {
            this.f387568b.put("domain", textView);
            return this;
        }

        @j.N
        public final a e(@j.P TextView textView) {
            this.f387568b.put("price", textView);
            return this;
        }

        @j.N
        public final a f(@j.P TextView textView) {
            this.f387568b.put("review_count", textView);
            return this;
        }

        @j.N
        public final a g(@j.P TextView textView) {
            this.f387568b.put("sponsored", textView);
            return this;
        }

        @j.N
        public final a h(@j.P TextView textView) {
            this.f387568b.put("title", textView);
            return this;
        }

        @j.N
        public final void i(@j.P TextView textView) {
            this.f387568b.put(ConstraintKt.WARNING, textView);
        }

        @j.N
        public final a a(@j.P TextView textView) {
            this.f387568b.put("age", textView);
            return this;
        }

        @j.N
        public final a b(@j.P TextView textView) {
            this.f387568b.put("body", textView);
            return this;
        }

        @j.N
        public final a c(@j.P ImageView imageView) {
            this.f387568b.put("icon", imageView);
            return this;
        }

        @j.N
        public final a a(@j.P ImageView imageView) {
            this.f387568b.put("favicon", imageView);
            return this;
        }

        @j.N
        public final a b(@j.P ImageView imageView) {
            this.f387568b.put("feedback", imageView);
            return this;
        }

        @j.N
        public final a a(@j.P CustomizableMediaView customizableMediaView) {
            this.f387568b.put("media", customizableMediaView);
            return this;
        }

        @j.N
        public final a a(@j.P View view) {
            this.f387568b.put("rating", view);
            return this;
        }

        @j.N
        public final void a(@j.P View view, @j.N String str) {
            this.f387568b.put(str, view);
        }
    }

    public /* synthetic */ ll0(a aVar, int i12) {
        this(aVar);
    }

    @j.N
    public final Map<String, View> a() {
        return this.f387566b;
    }

    @j.N
    public final View b() {
        return this.f387565a;
    }

    private ll0(@j.N a aVar) {
        this.f387565a = aVar.f387567a;
        this.f387566b = aVar.f387568b;
    }
}
