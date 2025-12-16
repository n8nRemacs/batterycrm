package com.avito.android.messenger.conversation.mvi.quick_replies.adapter;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: QuickReplyItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a;", "Lcom/avito/conveyor_item/a;", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a$b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a extends com.avito.conveyor_item.a {

    /* compiled from: QuickReplyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a$a, reason: collision with other inner class name */
    public static final class C5743a {
    }

    @k
    /* renamed from: getText */
    String getF194078d();

    /* compiled from: QuickReplyItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a$b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f194073b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f194074c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f194075d;

        public b(@k String str, @l Image image, @k String str2) {
            this.f194073b = str;
            this.f194074c = image;
            this.f194075d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f194073b, bVar.f194073b) && L.f(this.f194074c, bVar.f194074c) && L.f(this.f194075d, bVar.f194075d);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF124032b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF183505b() {
            return this.f194073b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a
        @k
        /* renamed from: getText, reason: from getter */
        public final String getF194078d() {
            return this.f194075d;
        }

        public final int hashCode() {
            int iHashCode = this.f194073b.hashCode() * 31;
            Image image = this.f194074c;
            return this.f194075d.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForEditing(stringId=");
            sb2.append(this.f194073b);
            sb2.append(", avatar=");
            sb2.append(this.f194074c);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f194075d, ')');
        }

        public /* synthetic */ b(String str, Image image, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : image, str2);
        }
    }

    /* compiled from: QuickReplyItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a$c;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f194076b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f194077c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f194078d;

        public c(@k String str, @l Image image, @k String str2) {
            this.f194076b = str;
            this.f194077c = image;
            this.f194078d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f194076b, cVar.f194076b) && L.f(this.f194077c, cVar.f194077c) && L.f(this.f194078d, cVar.f194078d);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF124032b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF183505b() {
            return this.f194076b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a
        @k
        /* renamed from: getText, reason: from getter */
        public final String getF194078d() {
            return this.f194078d;
        }

        public final int hashCode() {
            int iHashCode = this.f194076b.hashCode() * 31;
            Image image = this.f194077c;
            return this.f194078d.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForViewing(stringId=");
            sb2.append(this.f194076b);
            sb2.append(", avatar=");
            sb2.append(this.f194077c);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f194078d, ')');
        }

        public /* synthetic */ c(String str, Image image, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : image, str2);
        }
    }
}
