package com.avito.android.util.text;

import PK0.n;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.text.Editable;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D5;
import com.avito.android.util.V2;
import java.util.Collections;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AttributedTextFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/text/b;", "Lcom/avito/android/util/text/a;", "<init>", "()V", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.util.text.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final JK0.e f319068a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f319069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D5 f319070c;

    /* compiled from: AttributedTextFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<CharSequence, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f319071l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ CharSequence invoke(CharSequence charSequence) {
            return null;
        }
    }

    /* compiled from: AttributedTextFormatter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/text/b$b", "Lcom/avito/android/util/D5$a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.text.b$b, reason: collision with other inner class name */
    public static final class C9893b implements D5.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AttributedText f319072a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JK0.d f319073b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f319074c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f319075d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f319076e;

        public C9893b(AttributedText attributedText, JK0.d dVar, Context context, n nVar, boolean z12) {
            this.f319072a = attributedText;
            this.f319073b = dVar;
            this.f319074c = context;
            this.f319075d = nVar;
            this.f319076e = z12;
        }

        @Override // com.avito.android.util.D5.a
        public final void a(@k Editable editable, @k String str, int i12, int i13) {
            Object next;
            String string = editable.subSequence(i12, i13).toString();
            Iterator<T> it = this.f319072a.getAttributes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((Attribute) next).getName(), str)) {
                        break;
                    }
                }
            }
            Attribute attribute = (Attribute) next;
            if (attribute != null) {
                this.f319073b.b(this.f319074c, this.f319075d, this.f319076e, editable, i12, string, attribute, this.f319072a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k JK0.e eVar, @k l<? super CharSequence, ? extends CharSequence> lVar) {
        this.f319068a = eVar;
        this.f319069b = (N) lVar;
        this.f319070c = new D5();
    }

    @Override // com.avito.android.util.text.a
    @Y61.l
    public final CharSequence a(@k Context context, @Y61.l n nVar, @Y61.l AttributedText attributedText) {
        return e(attributedText, context, nVar, false);
    }

    @Override // com.avito.android.util.text.a
    @Y61.l
    public final CharSequence b(@Y61.l AttributedText attributedText) {
        return e(attributedText, null, null, false);
    }

    @Override // com.avito.android.util.text.a
    @Y61.l
    public final CharSequence c(@k Context context, @Y61.l AttributedText attributedText) {
        return e(attributedText, context, null, false);
    }

    @Override // com.avito.android.util.text.a
    @Y61.l
    public final CharSequence d(@Y61.l AttributedText attributedText) {
        return e(attributedText, null, null, true);
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [Y41.l, kotlin.jvm.internal.N] */
    public final CharSequence e(AttributedText attributedText, Context context, n nVar, boolean z12) {
        if (attributedText == null) {
            return null;
        }
        JK0.d dVarA = this.f319068a.a(attributedText.getVersion());
        C9893b c9893b = new C9893b(attributedText, dVarA, context, nVar, z12);
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(attributedText.getText());
        dVarA.c(editableNewEditable);
        this.f319070c.getClass();
        D5.a(editableNewEditable, c9893b);
        if (!C43066x.q(editableNewEditable, "{{", false) && !C43066x.q(editableNewEditable, "}}", false)) {
            return editableNewEditable;
        }
        V2.f318762a.c("AttributedTextFormatter", "Unsupported format: " + ((Object) editableNewEditable), null);
        return (CharSequence) this.f319069b.invoke(editableNewEditable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC42830m
    public b() {
        this(new JK0.f(Collections.singletonMap(0, new KK0.a(null)), null, 2, null), a.f319071l);
        JK0.c.f8877a.getClass();
    }
}
