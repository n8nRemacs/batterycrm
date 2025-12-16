package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
public final class X extends AbstractC33042a {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215334a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<Y> f215335b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.L<c3> f215336c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.L<C33091m0> f215337d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.L<O1> f215338e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.O0 f215339f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.room.O0 f215340g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.room.O0 f215341h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.room.O0 f215342i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.room.O0 f215343j;

    public X(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215334a = messengerDatabase_Impl;
        this.f215335b = new C33086l(messengerDatabase_Impl);
        this.f215336c = new C33129w(messengerDatabase_Impl);
        this.f215337d = new H(messengerDatabase_Impl);
        this.f215338e = new Q(messengerDatabase_Impl);
        this.f215339f = new S(messengerDatabase_Impl);
        this.f215340g = new T(messengerDatabase_Impl);
        this.f215341h = new U(messengerDatabase_Impl);
        this.f215342i = new V(messengerDatabase_Impl);
        new W(messengerDatabase_Impl);
        this.f215343j = new C33046b(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C42006d A(String str, int i12, Collection collection, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT MIN(updated) FROM (\n                SELECT updated FROM channel\n                WHERE \n                    user_id = ?\n                    AND user_type = ?\n                    AND (? IS NULL OR is_read = ?)\n                    AND NOT EXISTS (\n                        SELECT tag \n                        FROM channel_tag AS c_tag\n                        WHERE\n                            c_tag.local_user_id = ?\n                            AND c_tag.local_user_type = ?\n                            AND c_tag.channel_id = channel.channel_id\n                            AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                        LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    )", "\n", "                ORDER BY updated DESC");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                LIMIT ", "?", " + 1");
        int i13 = 7;
        int i14 = size + 7;
        androidx.room.F0 f0C = androidx.room.F0.c(i14, androidx.camera.camera2.internal.G.h(sbR, "\n", "            )", "\n", "        "));
        f0C.h4(1, str);
        int i15 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r5.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r4.intValue());
        }
        f0C.h4(5, str);
        f0C.h4(6, str2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0C.h4(i13, (String) it.next());
            i13++;
        }
        f0C.g1(i14, i12);
        return androidx.room.rxjava3.g.b(new E(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C42006d B(String str, int i12, Collection collection, Collection collection2, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT MIN(updated) FROM (\n                SELECT updated FROM channel\n                WHERE \n                    user_id = ?\n                    AND user_type = ?\n                    AND (? IS NULL OR is_read = ?)\n                    AND EXISTS (\n                        SELECT tag \n                        FROM channel_tag AS c_tag\n                        WHERE\n                            c_tag.local_user_id = ?\n                            AND c_tag.local_user_type = ?\n                            AND c_tag.channel_id = channel.channel_id\n                            AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                        LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    )", "\n", "                    AND NOT EXISTS (");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        SELECT tag ", "\n", "                        FROM channel_tag AS c_tag");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        WHERE", "\n", "                            c_tag.local_user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                            AND c_tag.local_user_type = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            AND c_tag.channel_id = channel.channel_id", "\n", "                            AND c_tag.tag IN (");
        int size2 = collection2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                        LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    )", "\n", "                ORDER BY updated DESC");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                LIMIT ", "?", " + 1");
        int i13 = size + 9;
        int i14 = size2 + i13;
        androidx.room.F0 f0C = androidx.room.F0.c(i14, androidx.camera.camera2.internal.G.h(sbR, "\n", "            )", "\n", "        "));
        f0C.h4(1, str);
        int i15 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r8.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r7.intValue());
        }
        f0C.h4(5, str);
        f0C.h4(6, str2);
        Iterator it = collection.iterator();
        int i16 = 7;
        while (it.hasNext()) {
            f0C.h4(i16, (String) it.next());
            i16++;
        }
        f0C.h4(7 + size, str);
        int i17 = UserEntityType.a.f215321a;
        f0C.h4(size + 8, str2);
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            f0C.h4(i13, (String) it2.next());
            i13++;
        }
        f0C.g1(i14, i12);
        return androidx.room.rxjava3.g.b(new D(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final long C(Y y12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215335b.f(y12);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final kotlin.collections.builders.b D(AbstractCollection abstractCollection) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            kotlin.collections.builders.b bVarG = this.f215337d.g(abstractCollection);
            messengerDatabase_Impl.s();
            return bVarG;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final void E(Y y12, List list, ArrayList arrayList, O1 o12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.c();
        try {
            super.E(y12, list, arrayList, o12);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final kotlin.collections.builders.b F(ArrayList arrayList) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            kotlin.collections.builders.b bVarG = this.f215335b.g(arrayList);
            messengerDatabase_Impl.s();
            return bVarG;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final void G(ArrayList arrayList, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList2) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.c();
        try {
            F(arrayList);
            K(linkedHashSet);
            D(linkedHashSet2);
            I(arrayList2);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final long H(O1 o12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215338e.f(o12);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final kotlin.collections.builders.b I(ArrayList arrayList) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            kotlin.collections.builders.b bVarG = this.f215338e.g(arrayList);
            messengerDatabase_Impl.s();
            return bVarG;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final long J(c3 c3Var) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215336c.f(c3Var);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final kotlin.collections.builders.b K(LinkedHashSet linkedHashSet) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            kotlin.collections.builders.b bVarG = this.f215336c.g(linkedHashSet);
            messengerDatabase_Impl.s();
            return bVarG;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final io.reactivex.rxjava3.internal.operators.completable.r L(String str, String str2, ChannelIsReadStatus channelIsReadStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33054d(this, channelIsReadStatus, str, userEntityType, str2));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final io.reactivex.rxjava3.internal.operators.completable.r M(String str, String str2, ChannelIsReadStatus channelIsReadStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33050c(this, channelIsReadStatus, str, userEntityType, str2));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final io.reactivex.rxjava3.internal.operators.completable.r N(String str, String str2, boolean z12, List list, ChannelIsReadStatus channelIsReadStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new P(this, list, z12, channelIsReadStatus, str, userEntityType, str2));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final int a(String str, String str2, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215342i;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(2, userEntityType.f215320b);
        iVarA.h4(3, str2);
        try {
            messengerDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                messengerDatabase_Impl.s();
                return iB3;
            } finally {
                messengerDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final void b(UserEntityType userEntityType, String str, String str2, String str3) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.c();
        try {
            super.b(userEntityType, str, str2, str3);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final void c(String str, String str2, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.c();
        try {
            super.c(str, str2, userEntityType);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final io.reactivex.rxjava3.internal.operators.completable.r d(String str, String str2, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33058e(this, str, userEntityType, str2));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final int e(String str, String str2, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215343j;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(2, userEntityType.f215320b);
        iVarA.h4(3, str2);
        try {
            messengerDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                messengerDatabase_Impl.s();
                return iB3;
            } finally {
                messengerDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final void f(String str, UserEntityType userEntityType, ArrayList arrayList, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, Boolean bool) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.c();
        try {
            super.f(str, userEntityType, arrayList, arrayList2, linkedHashSet, linkedHashSet2, arrayList3, bool);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final int g(String str, Collection<String> collection, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            DELETE FROM channel\n            WHERE\n                user_id = ?\n                AND user_type = ?\n                AND channel_id IN (");
        V1.g.a(collection.size(), sb2);
        sb2.append(")");
        sb2.append("\n");
        sb2.append("        ");
        Z1.i iVarE = messengerDatabase_Impl.e(sb2.toString());
        iVarE.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        iVarE.h4(2, userEntityType.f215320b);
        Iterator<String> it = collection.iterator();
        int i13 = 3;
        while (it.hasNext()) {
            iVarE.h4(i13, it.next());
            i13++;
        }
        messengerDatabase_Impl.c();
        try {
            int iB3 = iVarE.B3();
            messengerDatabase_Impl.s();
            return iB3;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final int h(String str, Collection<String> collection, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            DELETE FROM channel_tag\n            WHERE\n                local_user_id = ?\n                AND local_user_type = ?\n                AND channel_id IN (");
        V1.g.a(collection.size(), sb2);
        sb2.append(")");
        sb2.append("\n");
        sb2.append("        ");
        Z1.i iVarE = messengerDatabase_Impl.e(sb2.toString());
        iVarE.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        iVarE.h4(2, userEntityType.f215320b);
        Iterator<String> it = collection.iterator();
        int i13 = 3;
        while (it.hasNext()) {
            iVarE.h4(i13, it.next());
            i13++;
        }
        messengerDatabase_Impl.c();
        try {
            int iB3 = iVarE.B3();
            messengerDatabase_Impl.s();
            return iB3;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final ArrayList i(String str, UserEntityType userEntityType, Boolean bool) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            SELECT channel.channel_id FROM channel\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND (? IS NULL OR is_read = ?)\n            ORDER BY updated DESC\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r7.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r6.intValue());
        }
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final ArrayList j(String str, UserEntityType userEntityType, SortedSet sortedSet, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT channel.channel_id FROM channel\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND (? IS NULL OR is_read = ?)\n                AND NOT EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = channel.channel_id\n                        AND c_tag.tag IN (");
        int size = sortedSet.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            ORDER BY updated DESC");
        androidx.room.F0 f0C = androidx.room.F0.c(size + 6, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r4.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r3.intValue());
        }
        f0C.h4(5, str);
        f0C.h4(6, str2);
        Iterator it = sortedSet.iterator();
        int i13 = 7;
        while (it.hasNext()) {
            f0C.h4(i13, (String) it.next());
            i13++;
        }
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final ArrayList k(String str, UserEntityType userEntityType, SortedSet sortedSet, SortedSet sortedSet2, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT channel.channel_id FROM channel\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND (? IS NULL OR is_read = ?)\n                AND EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = channel.channel_id\n                        AND c_tag.tag IN (");
        int size = sortedSet.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "                AND NOT EXISTS (");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    SELECT tag ", "\n", "                    FROM channel_tag AS c_tag");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    WHERE", "\n", "                        c_tag.local_user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                        AND c_tag.local_user_type = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        AND c_tag.channel_id = channel.channel_id", "\n", "                        AND c_tag.tag IN (");
        int size2 = sortedSet2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            ORDER BY updated DESC");
        int i12 = size + 8;
        androidx.room.F0 f0C = androidx.room.F0.c(size2 + i12, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r6.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r5.intValue());
        }
        f0C.h4(5, str);
        f0C.h4(6, str2);
        Iterator it = sortedSet.iterator();
        int i14 = 7;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(7 + size, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(i12, str2);
        int i16 = size + 9;
        Iterator it2 = sortedSet2.iterator();
        while (it2.hasNext()) {
            f0C.h4(i16, (String) it2.next());
            i16++;
        }
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 l(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n            SELECT * FROM channel\n            WHERE user_id = ? \n                AND channel_id = ? \n                AND user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        CallableC33062f callableC33062f = new CallableC33062f(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215334a, false, new String[]{"channel"}, callableC33062f);
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final ArrayList m(UserEntityType userEntityType, String str, String str2, String str3) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            SELECT channel_id FROM channel\n            WHERE \n                user_id = ? \n                AND item_id = ?\n                AND interlocutor_id = ?\n                AND user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.h4(3, str3);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215334a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 n(String str, ChannelIsReadStatus channelIsReadStatus, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n            select channel_id\n            from channel\n            where\n                user_id = ?\n                and user_type = ?\n                and is_read_status = ?\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        int i13 = ChannelIsReadStatus.a.f215155a;
        f0C.h4(3, channelIsReadStatus.name());
        L l12 = new L(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215334a, false, new String[]{"channel"}, l12);
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 o(String str, Collection collection, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT * FROM channel\n            WHERE\n                user_id = ?\n                AND channel_id IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                AND user_type = ");
        int i12 = 2;
        int i13 = size + 2;
        androidx.room.F0 f0C = androidx.room.F0.c(i13, androidx.camera.camera2.internal.G.g(sbR, "?", "\n", "        "));
        f0C.h4(1, str);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i13, userEntityType.f215320b);
        CallableC33082k callableC33082k = new CallableC33082k(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215334a, false, new String[]{"channel"}, callableC33082k);
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 p(String str, long j12, Collection collection, Collection collection2, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n                AND NOT EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = c.channel_id\n                        AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            UNION ALL");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                SELECT", "\n", "                    c.*,");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date", "\n", "                FROM channel AS c");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                LEFT JOIN (", "\n", "                        SELECT ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            m.channel_id AS channel_id,", "\n", "                            MAX(m.created) AS created");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        FROM message AS m", "\n", "                        WHERE m.user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", " AND m.user_type = ", "?", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        GROUP BY m.channel_id", "\n", "                    ) AS last_messages", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    ON last_messages.channel_id = c.channel_id", "\n", "                WHERE ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    c.user_id = ", "?", "\n", "                    AND c.user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                    AND (", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, " IS NULL OR c.is_read = ", "?", ")", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    AND NOT EXISTS (", "\n", "                        SELECT tag ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        FROM channel_tag AS c_tag", "\n", "                        WHERE", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                            c_tag.local_user_id = ", "?", "\n", "                            AND c_tag.local_user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                            AND c_tag.channel_id = c.channel_id", "\n");
        sbR.append("                            AND c_tag.tag IN (");
        int size2 = collection2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        LIMIT 1", "\n", "                    )");
        int i12 = size + 17;
        androidx.room.F0 f0C = androidx.room.F0.c(size2 + i12, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r11.intValue());
        }
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r11.intValue());
        }
        f0C.h4(8, str);
        f0C.h4(9, str2);
        Iterator it = collection.iterator();
        int i14 = 10;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(10 + size, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(size + 11, str2);
        f0C.h4(size + 12, str);
        f0C.h4(size + 13, str2);
        int i16 = size + 14;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(i16);
        } else {
            f0C.g1(i16, r12.intValue());
        }
        int i17 = size + 15;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(i17);
        } else {
            f0C.g1(i17, r10.intValue());
        }
        f0C.h4(size + 16, str);
        f0C.h4(i12, str2);
        int i18 = size + 18;
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            f0C.h4(i18, (String) it2.next());
            i18++;
        }
        return androidx.room.rxjava3.g.a(this.f215334a, true, new String[]{"channel", "message", "channel_tag"}, new CallableC33102p(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 q(String str, long j12, Collection collection, Collection collection2, Collection collection3, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n                AND NOT EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = c.channel_id\n                        AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            UNION ALL");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                SELECT", "\n", "                    c.*,");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date", "\n", "                FROM channel AS c");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                LEFT JOIN (", "\n", "                        SELECT ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            m.channel_id AS channel_id,", "\n", "                            MAX(m.created) AS created");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        FROM message AS m", "\n", "                        WHERE m.user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", " AND m.user_type = ", "?", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        GROUP BY m.channel_id", "\n", "                    ) AS last_messages", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    ON last_messages.channel_id = c.channel_id", "\n", "                WHERE ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    c.user_id = ", "?", "\n", "                    AND c.user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                    AND (", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, " IS NULL OR c.is_read = ", "?", ")", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    AND EXISTS (", "\n", "                        SELECT tag ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        FROM channel_tag AS c_tag", "\n", "                        WHERE", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                            c_tag.local_user_id = ", "?", "\n", "                            AND c_tag.local_user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                            AND c_tag.channel_id = c.channel_id", "\n");
        sbR.append("                            AND c_tag.tag IN (");
        int size2 = collection2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        LIMIT 1", "\n", "                    )");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    AND NOT EXISTS (", "\n", "                        SELECT tag ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        FROM channel_tag AS c_tag", "\n", "                        WHERE");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            c_tag.local_user_id = ", "?", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                            AND c_tag.local_user_type = ", "?", "\n", "                            AND c_tag.channel_id = c.channel_id");
        sbR.append("\n");
        sbR.append("                            AND c_tag.tag IN (");
        int size3 = collection3.size();
        V1.g.a(size3, sbR);
        androidx.media3.exoplayer.analytics.m.p(sbR, ")", "\n", "                        LIMIT 1", "\n");
        int i12 = size + 19 + size2;
        androidx.room.F0 f0C = androidx.room.F0.c(size3 + i12, androidx.camera.camera2.internal.G.g(sbR, "                    )", "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r7.intValue());
        }
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r7.intValue());
        }
        f0C.h4(8, str);
        f0C.h4(9, str2);
        Iterator it = collection.iterator();
        int i14 = 10;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(size + 10, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(size + 11, str2);
        f0C.h4(size + 12, str);
        f0C.h4(size + 13, str2);
        int i16 = size + 14;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(i16);
        } else {
            f0C.g1(i16, r8.intValue());
        }
        int i17 = size + 15;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(i17);
        } else {
            f0C.g1(i17, r6.intValue());
        }
        f0C.h4(size + 16, str);
        f0C.h4(size + 17, str2);
        int i18 = size + 18;
        Iterator it2 = collection2.iterator();
        int i19 = i18;
        while (it2.hasNext()) {
            f0C.h4(i19, (String) it2.next());
            i19++;
        }
        f0C.h4(i18 + size2, str);
        int i22 = UserEntityType.a.f215321a;
        f0C.h4(i12, str2);
        int i23 = size + 20 + size2;
        Iterator it3 = collection3.iterator();
        while (it3.hasNext()) {
            f0C.h4(i23, (String) it3.next());
            i23++;
        }
        return androidx.room.rxjava3.g.a(this.f215334a, true, new String[]{"channel", "message", "channel_tag"}, new CallableC33098o(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 r(String str, long j12, Collection collection, Collection collection2, Collection collection3, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n                AND EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = c.channel_id\n                        AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "                AND NOT EXISTS (");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    SELECT tag ", "\n", "                    FROM channel_tag AS c_tag");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    WHERE", "\n", "                        c_tag.local_user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                        AND c_tag.local_user_type = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        AND c_tag.channel_id = c.channel_id", "\n", "                        AND c_tag.tag IN (");
        int size2 = collection2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            UNION ALL");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                SELECT", "\n", "                    c.*,");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date", "\n", "                FROM channel AS c");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                LEFT JOIN (", "\n", "                        SELECT ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            m.channel_id AS channel_id,", "\n", "                            MAX(m.created) AS created");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        FROM message AS m", "\n", "                        WHERE m.user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", " AND m.user_type = ", "?", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        GROUP BY m.channel_id", "\n", "                    ) AS last_messages", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    ON last_messages.channel_id = c.channel_id", "\n", "                WHERE ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    c.user_id = ", "?", "\n", "                    AND c.user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                    AND (", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, " IS NULL OR c.is_read = ", "?", ")", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    AND NOT EXISTS (", "\n", "                        SELECT tag ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        FROM channel_tag AS c_tag", "\n", "                        WHERE", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                            c_tag.local_user_id = ", "?", "\n", "                            AND c_tag.local_user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                            AND c_tag.channel_id = c.channel_id", "\n");
        sbR.append("                            AND c_tag.tag IN (");
        int size3 = collection3.size();
        V1.g.a(size3, sbR);
        sbR.append(")");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        LIMIT 1", "\n", "                    )");
        int i12 = size + 19 + size2;
        androidx.room.F0 f0C = androidx.room.F0.c(size3 + i12, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r9.intValue());
        }
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r9.intValue());
        }
        f0C.h4(8, str);
        f0C.h4(9, str2);
        Iterator it = collection.iterator();
        int i14 = 10;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(10 + size, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(size + 11, str2);
        int i16 = size + 12;
        Iterator it2 = collection2.iterator();
        int i17 = i16;
        while (it2.hasNext()) {
            f0C.h4(i17, (String) it2.next());
            i17++;
        }
        f0C.h4(i16 + size2, str);
        int i18 = UserEntityType.a.f215321a;
        f0C.h4(size + 13 + size2, str2);
        f0C.h4(size + 14 + size2, str);
        f0C.h4(size + 15 + size2, str2);
        int i19 = size + 16 + size2;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(i19);
        } else {
            f0C.g1(i19, r9.intValue());
        }
        int i22 = size + 17 + size2;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(i22);
        } else {
            f0C.g1(i22, r8.intValue());
        }
        f0C.h4(size + 18 + size2, str);
        f0C.h4(i12, str2);
        int i23 = size + 20 + size2;
        Iterator it3 = collection3.iterator();
        while (it3.hasNext()) {
            f0C.h4(i23, (String) it3.next());
            i23++;
        }
        return androidx.room.rxjava3.g.a(this.f215334a, true, new String[]{"channel", "message", "channel_tag"}, new CallableC33094n(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 s(String str, long j12, Collection collection, Collection collection2, Collection collection3, Collection collection4, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n                AND EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = c.channel_id\n                        AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "                AND NOT EXISTS (");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    SELECT tag ", "\n", "                    FROM channel_tag AS c_tag");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    WHERE", "\n", "                        c_tag.local_user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                        AND c_tag.local_user_type = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        AND c_tag.channel_id = c.channel_id", "\n", "                        AND c_tag.tag IN (");
        int size2 = collection2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            UNION ALL");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                SELECT", "\n", "                    c.*,");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date", "\n", "                FROM channel AS c");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                LEFT JOIN (", "\n", "                        SELECT ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            m.channel_id AS channel_id,", "\n", "                            MAX(m.created) AS created");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        FROM message AS m", "\n", "                        WHERE m.user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", " AND m.user_type = ", "?", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        GROUP BY m.channel_id", "\n", "                    ) AS last_messages", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    ON last_messages.channel_id = c.channel_id", "\n", "                WHERE ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    c.user_id = ", "?", "\n", "                    AND c.user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                    AND (", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, " IS NULL OR c.is_read = ", "?", ")", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                    AND EXISTS (", "\n", "                        SELECT tag ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                        FROM channel_tag AS c_tag", "\n", "                        WHERE", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                            c_tag.local_user_id = ", "?", "\n", "                            AND c_tag.local_user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                            AND c_tag.channel_id = c.channel_id", "\n");
        sbR.append("                            AND c_tag.tag IN (");
        int size3 = collection3.size();
        V1.g.a(size3, sbR);
        sbR.append(")");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        LIMIT 1", "\n", "                    )");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    AND NOT EXISTS (", "\n", "                        SELECT tag ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        FROM channel_tag AS c_tag", "\n", "                        WHERE");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                            c_tag.local_user_id = ", "?", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                            AND c_tag.local_user_type = ", "?", "\n", "                            AND c_tag.channel_id = c.channel_id");
        sbR.append("\n");
        sbR.append("                            AND c_tag.tag IN (");
        int size4 = collection4.size();
        V1.g.a(size4, sbR);
        androidx.media3.exoplayer.analytics.m.p(sbR, ")", "\n", "                        LIMIT 1", "\n");
        int i12 = size + 21 + size2 + size3;
        androidx.room.F0 f0C = androidx.room.F0.c(size4 + i12, androidx.camera.camera2.internal.G.g(sbR, "                    )", "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r7.intValue());
        }
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r7.intValue());
        }
        f0C.h4(8, str);
        f0C.h4(9, str2);
        Iterator it = collection.iterator();
        int i14 = 10;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(size + 10, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(size + 11, str2);
        int i16 = size + 12;
        Iterator it2 = collection2.iterator();
        int i17 = i16;
        while (it2.hasNext()) {
            f0C.h4(i17, (String) it2.next());
            i17++;
        }
        f0C.h4(i16 + size2, str);
        int i18 = UserEntityType.a.f215321a;
        f0C.h4(size + 13 + size2, str2);
        f0C.h4(size + 14 + size2, str);
        f0C.h4(size + 15 + size2, str2);
        int i19 = size + 16 + size2;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(i19);
        } else {
            f0C.g1(i19, r8.intValue());
        }
        int i22 = size + 17 + size2;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(i22);
        } else {
            f0C.g1(i22, r6.intValue());
        }
        f0C.h4(size + 18 + size2, str);
        f0C.h4(size + 19 + size2, str2);
        int i23 = size + 20 + size2;
        Iterator it3 = collection3.iterator();
        int i24 = i23;
        while (it3.hasNext()) {
            f0C.h4(i24, (String) it3.next());
            i24++;
        }
        f0C.h4(i23 + size3, str);
        int i25 = UserEntityType.a.f215321a;
        f0C.h4(i12, str2);
        int i26 = size + 22 + size2 + size3;
        Iterator it4 = collection4.iterator();
        while (it4.hasNext()) {
            f0C.h4(i26, (String) it4.next());
            i26++;
        }
        return androidx.room.rxjava3.g.a(this.f215334a, true, new String[]{"channel", "message", "channel_tag"}, new CallableC33090m(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 t(String str, long j12, UserEntityType userEntityType, Boolean bool) {
        androidx.room.F0 f0C = androidx.room.F0.c(7, "\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n            ORDER BY c_date DESC\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r6.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r5.intValue());
        }
        return androidx.room.rxjava3.g.a(this.f215334a, false, new String[]{"channel", "message"}, new CallableC33113s(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 u(String str, long j12, Collection collection, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n                AND NOT EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = c.channel_id\n                        AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            ORDER BY c_date DESC");
        androidx.room.F0 f0C = androidx.room.F0.c(size + 9, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r9.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r8.intValue());
        }
        f0C.h4(8, str);
        f0C.h4(9, str2);
        Iterator it = collection.iterator();
        int i13 = 10;
        while (it.hasNext()) {
            f0C.h4(i13, (String) it.next());
            i13++;
        }
        return androidx.room.rxjava3.g.a(this.f215334a, false, new String[]{"channel", "message", "channel_tag"}, new r(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C41933a0 v(String str, long j12, Collection collection, Collection collection2, UserEntityType userEntityType, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT\n                c.*,\n                MAX(c.updated, IFNULL(last_messages.created, 0)) AS c_date\n            FROM channel AS c\n            LEFT JOIN (\n                    SELECT \n                        m.channel_id AS channel_id,\n                        MAX(m.created) AS created\n                    FROM message AS m\n                    WHERE m.user_id = ? AND m.user_type = ?\n                    GROUP BY m.channel_id\n                ) AS last_messages\n                ON last_messages.channel_id = c.channel_id\n            WHERE \n                c.user_id = ?\n                AND c.user_type = ?\n                AND c_date >= ?\n                AND (? IS NULL OR c.is_read = ?)\n                AND EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = c.channel_id\n                        AND c_tag.tag IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "                AND NOT EXISTS (");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    SELECT tag ", "\n", "                    FROM channel_tag AS c_tag");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    WHERE", "\n", "                        c_tag.local_user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                        AND c_tag.local_user_type = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        AND c_tag.channel_id = c.channel_id", "\n", "                        AND c_tag.tag IN (");
        int size2 = collection2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            ORDER BY c_date DESC");
        int i12 = size + 11;
        androidx.room.F0 f0C = androidx.room.F0.c(size2 + i12, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        f0C.h4(3, str);
        f0C.h4(4, str2);
        f0C.g1(5, j12);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(6);
        } else {
            f0C.g1(6, r9.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(7);
        } else {
            f0C.g1(7, r8.intValue());
        }
        f0C.h4(8, str);
        f0C.h4(9, str2);
        Iterator it = collection.iterator();
        int i14 = 10;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(10 + size, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(i12, str2);
        int i16 = size + 12;
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            f0C.h4(i16, (String) it2.next());
            i16++;
        }
        return androidx.room.rxjava3.g.a(this.f215334a, false, new String[]{"channel", "message", "channel_tag"}, new CallableC33106q(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C42006d w(String str, UserEntityType userEntityType, Boolean bool) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            SELECT channel.updated FROM channel\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND (? IS NULL OR is_read = ?)\n            ORDER BY updated DESC\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r7.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r6.intValue());
        }
        return androidx.room.rxjava3.g.b(new O(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C42006d x(String str, UserEntityType userEntityType, SortedSet sortedSet, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT channel.updated FROM channel\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND (? IS NULL OR is_read = ?)\n                AND NOT EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = channel.channel_id\n                        AND c_tag.tag IN (");
        int size = sortedSet.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            ORDER BY updated DESC");
        androidx.room.F0 f0C = androidx.room.F0.c(size + 6, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r4.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r3.intValue());
        }
        f0C.h4(5, str);
        f0C.h4(6, str2);
        Iterator it = sortedSet.iterator();
        int i13 = 7;
        while (it.hasNext()) {
            f0C.h4(i13, (String) it.next());
            i13++;
        }
        return androidx.room.rxjava3.g.b(new N(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C42006d y(String str, UserEntityType userEntityType, SortedSet sortedSet, SortedSet sortedSet2, Boolean bool) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT channel.updated FROM channel\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND (? IS NULL OR is_read = ?)\n                AND EXISTS (\n                    SELECT tag \n                    FROM channel_tag AS c_tag\n                    WHERE\n                        c_tag.local_user_id = ?\n                        AND c_tag.local_user_type = ?\n                        AND c_tag.channel_id = channel.channel_id\n                        AND c_tag.tag IN (");
        int size = sortedSet.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "                AND NOT EXISTS (");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    SELECT tag ", "\n", "                    FROM channel_tag AS c_tag");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                    WHERE", "\n", "                        c_tag.local_user_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                        AND c_tag.local_user_type = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                        AND c_tag.channel_id = channel.channel_id", "\n", "                        AND c_tag.tag IN (");
        int size2 = sortedSet2.size();
        V1.g.a(size2, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                    LIMIT 1");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "                )", "\n", "            ORDER BY updated DESC");
        int i12 = size + 8;
        androidx.room.F0 f0C = androidx.room.F0.c(size2 + i12, AK.c.s(sbR, "\n", "        "));
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        String str2 = userEntityType.f215320b;
        f0C.h4(2, str2);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r6.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r5.intValue());
        }
        f0C.h4(5, str);
        f0C.h4(6, str2);
        Iterator it = sortedSet.iterator();
        int i14 = 7;
        while (it.hasNext()) {
            f0C.h4(i14, (String) it.next());
            i14++;
        }
        f0C.h4(7 + size, str);
        int i15 = UserEntityType.a.f215321a;
        f0C.h4(i12, str2);
        int i16 = size + 9;
        Iterator it2 = sortedSet2.iterator();
        while (it2.hasNext()) {
            f0C.h4(i16, (String) it2.next());
            i16++;
        }
        return androidx.room.rxjava3.g.b(new M(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.AbstractC33042a
    public final C42006d z(String str, int i12, UserEntityType userEntityType, Boolean bool) {
        androidx.room.F0 f0C = androidx.room.F0.c(5, "\n            SELECT MIN(updated) FROM (\n                SELECT updated FROM channel\n                WHERE \n                    user_id = ?\n                    AND user_type = ?\n                    AND (? IS NULL OR is_read = ?)\n                ORDER BY updated DESC\n                LIMIT ? + 1\n            )\n        ");
        f0C.h4(1, str);
        int i13 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            f0C.B4(3);
        } else {
            f0C.g1(3, r8.intValue());
        }
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            f0C.B4(4);
        } else {
            f0C.g1(4, r6.intValue());
        }
        f0C.g1(5, i12);
        return androidx.room.rxjava3.g.b(new F(this, f0C));
    }
}
