package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.coi;
import defpackage.fl9;
import defpackage.gd3;
import defpackage.hd3;
import defpackage.jei;
import defpackage.kp7;
import defpackage.tn8;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.EglBase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public interface Tasks {
    public static final int EMOJI = 0;
    public static final int FAVORITE_STICKER = 3;
    public static final int FAVORITE_STICKER_SET = 4;
    public static final int RECENT = 5;
    public static final int STICKER = 1;
    public static final int STICKER_REACTION = 1;
    public static final int STICKER_SET = 2;
    public static final int UNKNOWN = 0;

    public static final class AssetsAdd extends fl9 {
        private static volatile AssetsAdd[] _emptyArray;
        public int assetType;
        public long id;
        public long requestId;

        public AssetsAdd() {
            clear();
        }

        public static AssetsAdd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsAdd[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsAdd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsAdd) fl9.mergeFrom(new AssetsAdd(), bArr);
        }

        public AssetsAdd clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                iH += hd3.f(2, i);
            }
            long j2 = this.id;
            return j2 != 0 ? hd3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                hd3Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
        }

        public static AssetsAdd parseFrom(gd3 gd3Var) throws IOException {
            return new AssetsAdd().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public AssetsAdd mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    int iP = gd3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class AssetsListModify extends fl9 {
        private static volatile AssetsListModify[] _emptyArray;
        public int assetType;
        public long[] ids;
        public long modifyTime;
        public long requestId;

        public AssetsListModify() {
            clear();
        }

        public static AssetsListModify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsListModify[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsListModify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsListModify) fl9.mergeFrom(new AssetsListModify(), bArr);
        }

        public AssetsListModify clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.ids = coi.b;
            this.modifyTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                iH += hd3.f(2, i2);
            }
            long[] jArr2 = this.ids;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.ids;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += hd3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.modifyTime;
            return j2 != 0 ? hd3.h(4, j2) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                hd3Var.w(2, i);
            }
            long[] jArr = this.ids;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    hd3Var.x(3, jArr2[i2]);
                    i2++;
                }
            }
            long j2 = this.modifyTime;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
        }

        public static AssetsListModify parseFrom(gd3 gd3Var) throws IOException {
            return new AssetsListModify().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public AssetsListModify mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    int iP = gd3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    int iB = coi.b(gd3Var, 24);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iB + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = gd3Var.q();
                        gd3Var.s();
                        length++;
                    }
                    jArr2[length] = gd3Var.q();
                    this.ids = jArr2;
                } else if (iS == 26) {
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i2++;
                    }
                    gd3Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = gd3Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    gd3Var.d(iE);
                } else if (iS == 32) {
                    this.modifyTime = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class AssetsMove extends fl9 {
        private static volatile AssetsMove[] _emptyArray;
        public int assetType;
        public long id;
        public int position;
        public long prevId;
        public long requestId;

        public AssetsMove() {
            clear();
        }

        public static AssetsMove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsMove[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsMove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsMove) fl9.mergeFrom(new AssetsMove(), bArr);
        }

        public AssetsMove clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.prevId = 0L;
            this.position = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                iH += hd3.f(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                iH += hd3.h(4, j3);
            }
            int i2 = this.position;
            return i2 != 0 ? hd3.f(5, i2) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                hd3Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                hd3Var.x(4, j3);
            }
            int i2 = this.position;
            if (i2 != 0) {
                hd3Var.w(5, i2);
            }
        }

        public static AssetsMove parseFrom(gd3 gd3Var) throws IOException {
            return new AssetsMove().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public AssetsMove mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    int iP = gd3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = gd3Var.q();
                } else if (iS == 32) {
                    this.prevId = gd3Var.q();
                } else if (iS == 40) {
                    this.position = gd3Var.p();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class AssetsRemove extends fl9 {
        private static volatile AssetsRemove[] _emptyArray;
        public int assetType;
        public long id;
        public long[] ids;
        public long requestId;

        public AssetsRemove() {
            clear();
        }

        public static AssetsRemove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsRemove[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsRemove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsRemove) fl9.mergeFrom(new AssetsRemove(), bArr);
        }

        public AssetsRemove clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.ids = coi.b;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                iH += hd3.f(2, i2);
            }
            long j2 = this.id;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return iH;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i >= jArr2.length) {
                    return iH + iK + jArr2.length;
                }
                iK += hd3.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                hd3Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i2 >= jArr2.length) {
                    return;
                }
                hd3Var.x(4, jArr2[i2]);
                i2++;
            }
        }

        public static AssetsRemove parseFrom(gd3 gd3Var) throws IOException {
            return new AssetsRemove().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public AssetsRemove mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    int iP = gd3Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = gd3Var.q();
                } else if (iS == 32) {
                    int iB = coi.b(gd3Var, 32);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iB + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = gd3Var.q();
                        gd3Var.s();
                        length++;
                    }
                    jArr2[length] = gd3Var.q();
                    this.ids = jArr2;
                } else if (iS == 34) {
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i2++;
                    }
                    gd3Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = gd3Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    gd3Var.d(iE);
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChangeChatPhoto extends fl9 {
        private static volatile ChangeChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeChatPhoto() {
            clear();
        }

        public static ChangeChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeChatPhoto[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeChatPhoto) fl9.mergeFrom(new ChangeChatPhoto(), bArr);
        }

        public ChangeChatPhoto clear() {
            this.requestId = 0L;
            this.file = "";
            this.chatId = 0L;
            this.crop = null;
            this.lastModified = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += hd3.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += hd3.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? hd3.h(5, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                hd3Var.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                hd3Var.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
        }

        public static ChangeChatPhoto parseFrom(gd3 gd3Var) throws IOException {
            return new ChangeChatPhoto().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChangeChatPhoto mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.file = gd3Var.r();
                } else if (iS == 24) {
                    this.chatId = gd3Var.q();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    gd3Var.j(this.crop);
                } else if (iS == 40) {
                    this.lastModified = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChangeProfileOrChatPhoto extends fl9 {
        private static volatile ChangeProfileOrChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeProfileOrChatPhoto() {
            clear();
        }

        public static ChangeProfileOrChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeProfileOrChatPhoto[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeProfileOrChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeProfileOrChatPhoto) fl9.mergeFrom(new ChangeProfileOrChatPhoto(), bArr);
        }

        public ChangeProfileOrChatPhoto clear() {
            this.requestId = 0L;
            this.file = "";
            this.chatId = 0L;
            this.crop = null;
            this.lastModified = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += hd3.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += hd3.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? hd3.h(5, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                hd3Var.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                hd3Var.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
        }

        public static ChangeProfileOrChatPhoto parseFrom(gd3 gd3Var) throws IOException {
            return new ChangeProfileOrChatPhoto().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChangeProfileOrChatPhoto mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.file = gd3Var.r();
                } else if (iS == 24) {
                    this.chatId = gd3Var.q();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    gd3Var.j(this.crop);
                } else if (iS == 40) {
                    this.lastModified = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChannelLeave extends fl9 {
        private static volatile ChannelLeave[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChannelLeave() {
            clear();
        }

        public static ChannelLeave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChannelLeave[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChannelLeave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChannelLeave) fl9.mergeFrom(new ChannelLeave(), bArr);
        }

        public ChannelLeave clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? hd3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
        }

        public static ChannelLeave parseFrom(gd3 gd3Var) throws IOException {
            return new ChannelLeave().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChannelLeave mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatClear extends fl9 {
        private static volatile ChatClear[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatClear() {
            clear();
        }

        public static ChatClear[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClear[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClear parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClear) fl9.mergeFrom(new ChatClear(), bArr);
        }

        public ChatClear clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.lastEventTime = 0L;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            return this.forAll ? hd3.a(5) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                hd3Var.r(5, z);
            }
        }

        public static ChatClear parseFrom(gd3 gd3Var) throws IOException {
            return new ChatClear().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatClear mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 32) {
                    this.lastEventTime = gd3Var.q();
                } else if (iS == 40) {
                    this.forAll = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatClose extends fl9 {
        private static volatile ChatClose[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatClose() {
            clear();
        }

        public static ChatClose[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClose[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClose parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClose) fl9.mergeFrom(new ChatClose(), bArr);
        }

        public ChatClose clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? hd3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
        }

        public static ChatClose parseFrom(gd3 gd3Var) throws IOException {
            return new ChatClose().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatClose mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatComplain extends fl9 {
        private static volatile ChatComplain[] _emptyArray;
        public long chatId;
        public String complaint;
        public long requestId;

        public ChatComplain() {
            clear();
        }

        public static ChatComplain[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatComplain[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatComplain parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatComplain) fl9.mergeFrom(new ChatComplain(), bArr);
        }

        public ChatComplain clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.complaint = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            return !this.complaint.equals("") ? hd3.l(3, this.complaint) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (this.complaint.equals("")) {
                return;
            }
            hd3Var.E(3, this.complaint);
        }

        public static ChatComplain parseFrom(gd3 gd3Var) throws IOException {
            return new ChatComplain().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatComplain mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 26) {
                    this.complaint = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatCreate extends fl9 {
        private static volatile ChatCreate[] _emptyArray;
        public long chatId;
        public String chatType;
        public long cid;
        public long groupId;
        public long requestId;
        public String startPayload;
        public long subjectId;
        public String subjectType;

        public ChatCreate() {
            clear();
        }

        public static ChatCreate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatCreate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatCreate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatCreate) fl9.mergeFrom(new ChatCreate(), bArr);
        }

        public ChatCreate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatType = "";
            this.groupId = 0L;
            this.subjectType = "";
            this.subjectId = 0L;
            this.startPayload = "";
            this.cid = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            if (!this.chatType.equals("")) {
                iH += hd3.l(3, this.chatType);
            }
            long j3 = this.groupId;
            if (j3 != 0) {
                iH += hd3.h(4, j3);
            }
            if (!this.subjectType.equals("")) {
                iH += hd3.l(5, this.subjectType);
            }
            long j4 = this.subjectId;
            if (j4 != 0) {
                iH += hd3.h(6, j4);
            }
            if (!this.startPayload.equals("")) {
                iH += hd3.l(7, this.startPayload);
            }
            long j5 = this.cid;
            return j5 != 0 ? hd3.h(8, j5) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (!this.chatType.equals("")) {
                hd3Var.E(3, this.chatType);
            }
            long j3 = this.groupId;
            if (j3 != 0) {
                hd3Var.x(4, j3);
            }
            if (!this.subjectType.equals("")) {
                hd3Var.E(5, this.subjectType);
            }
            long j4 = this.subjectId;
            if (j4 != 0) {
                hd3Var.x(6, j4);
            }
            if (!this.startPayload.equals("")) {
                hd3Var.E(7, this.startPayload);
            }
            long j5 = this.cid;
            if (j5 != 0) {
                hd3Var.x(8, j5);
            }
        }

        public static ChatCreate parseFrom(gd3 gd3Var) throws IOException {
            return new ChatCreate().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatCreate mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 26) {
                    this.chatType = gd3Var.r();
                } else if (iS == 32) {
                    this.groupId = gd3Var.q();
                } else if (iS == 42) {
                    this.subjectType = gd3Var.r();
                } else if (iS == 48) {
                    this.subjectId = gd3Var.q();
                } else if (iS == 58) {
                    this.startPayload = gd3Var.r();
                } else if (iS == 64) {
                    this.cid = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatDelete extends fl9 {
        private static volatile ChatDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatDelete() {
            clear();
        }

        public static ChatDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatDelete[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatDelete) fl9.mergeFrom(new ChatDelete(), bArr);
        }

        public ChatDelete clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.lastEventTime = 0L;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            return this.forAll ? hd3.a(5) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                hd3Var.r(5, z);
            }
        }

        public static ChatDelete parseFrom(gd3 gd3Var) throws IOException {
            return new ChatDelete().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatDelete mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 32) {
                    this.lastEventTime = gd3Var.q();
                } else if (iS == 40) {
                    this.forAll = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatGroupMark extends fl9 {
        private static volatile ChatGroupMark[] _emptyArray;
        public long chatId;
        public boolean enabled;
        public String flagType;
        public long requestId;

        public ChatGroupMark() {
            clear();
        }

        public static ChatGroupMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatGroupMark[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatGroupMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatGroupMark) fl9.mergeFrom(new ChatGroupMark(), bArr);
        }

        public ChatGroupMark clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.flagType = "";
            this.enabled = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            if (!this.flagType.equals("")) {
                iH += hd3.l(3, this.flagType);
            }
            return this.enabled ? hd3.a(4) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (!this.flagType.equals("")) {
                hd3Var.E(3, this.flagType);
            }
            boolean z = this.enabled;
            if (z) {
                hd3Var.r(4, z);
            }
        }

        public static ChatGroupMark parseFrom(gd3 gd3Var) throws IOException {
            return new ChatGroupMark().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatGroupMark mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 26) {
                    this.flagType = gd3Var.r();
                } else if (iS == 32) {
                    this.enabled = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatHide extends fl9 {
        private static volatile ChatHide[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatHide() {
            clear();
        }

        public static ChatHide[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatHide[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatHide parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatHide) fl9.mergeFrom(new ChatHide(), bArr);
        }

        public ChatHide clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? hd3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
        }

        public static ChatHide parseFrom(gd3 gd3Var) throws IOException {
            return new ChatHide().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatHide mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatMark extends fl9 {
        private static volatile ChatMark[] _emptyArray;
        public boolean awaitChatInCache;
        public long chatId;
        public long chatServerId;
        public boolean isReadReaction;
        public long mark;
        public long messageId;
        public long requestId;
        public boolean setAsUnread;

        public ChatMark() {
            clear();
        }

        public static ChatMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMark[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMark) fl9.mergeFrom(new ChatMark(), bArr);
        }

        public ChatMark clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.mark = 0L;
            this.messageId = 0L;
            this.setAsUnread = false;
            this.awaitChatInCache = false;
            this.isReadReaction = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                iH += hd3.h(5, j5);
            }
            if (this.setAsUnread) {
                iH += hd3.a(6);
            }
            if (this.awaitChatInCache) {
                iH += hd3.a(7);
            }
            return this.isReadReaction ? hd3.a(8) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
            boolean z = this.setAsUnread;
            if (z) {
                hd3Var.r(6, z);
            }
            boolean z2 = this.awaitChatInCache;
            if (z2) {
                hd3Var.r(7, z2);
            }
            boolean z3 = this.isReadReaction;
            if (z3) {
                hd3Var.r(8, z3);
            }
        }

        public static ChatMark parseFrom(gd3 gd3Var) throws IOException {
            return new ChatMark().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatMark mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 32) {
                    this.mark = gd3Var.q();
                } else if (iS == 40) {
                    this.messageId = gd3Var.q();
                } else if (iS == 48) {
                    this.setAsUnread = gd3Var.f();
                } else if (iS == 56) {
                    this.awaitChatInCache = gd3Var.f();
                } else if (iS == 64) {
                    this.isReadReaction = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatMembersUpdate extends fl9 {
        private static volatile ChatMembersUpdate[] _emptyArray;
        public long chatId;
        public String chatMemberType;
        public long chatServerId;
        public String operation;
        public long requestId;
        public boolean showHistory;
        public long[] userIds;

        public ChatMembersUpdate() {
            clear();
        }

        public static ChatMembersUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMembersUpdate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMembersUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMembersUpdate) fl9.mergeFrom(new ChatMembersUpdate(), bArr);
        }

        public ChatMembersUpdate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.operation = "";
            this.userIds = coi.b;
            this.chatMemberType = "";
            this.showHistory = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            if (!this.operation.equals("")) {
                iH += hd3.l(4, this.operation);
            }
            long[] jArr2 = this.userIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.userIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += hd3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            if (!this.chatMemberType.equals("")) {
                iH += hd3.l(6, this.chatMemberType);
            }
            return this.showHistory ? hd3.a(7) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            if (!this.operation.equals("")) {
                hd3Var.E(4, this.operation);
            }
            long[] jArr = this.userIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.userIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    hd3Var.x(5, jArr2[i]);
                    i++;
                }
            }
            if (!this.chatMemberType.equals("")) {
                hd3Var.E(6, this.chatMemberType);
            }
            boolean z = this.showHistory;
            if (z) {
                hd3Var.r(7, z);
            }
        }

        public static ChatMembersUpdate parseFrom(gd3 gd3Var) throws IOException {
            return new ChatMembersUpdate().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatMembersUpdate mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 34) {
                    this.operation = gd3Var.r();
                } else if (iS == 40) {
                    int iB = coi.b(gd3Var, 40);
                    long[] jArr = this.userIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iB + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = gd3Var.q();
                        gd3Var.s();
                        length++;
                    }
                    jArr2[length] = gd3Var.q();
                    this.userIds = jArr2;
                } else if (iS == 42) {
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i2++;
                    }
                    gd3Var.t(iC);
                    long[] jArr3 = this.userIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = gd3Var.q();
                        length2++;
                    }
                    this.userIds = jArr4;
                    gd3Var.d(iE);
                } else if (iS == 50) {
                    this.chatMemberType = gd3Var.r();
                } else if (iS == 56) {
                    this.showHistory = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatPinSetVisibility extends fl9 {
        private static volatile ChatPinSetVisibility[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean show;

        public ChatPinSetVisibility() {
            clear();
        }

        public static ChatPinSetVisibility[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatPinSetVisibility[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatPinSetVisibility parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatPinSetVisibility) fl9.mergeFrom(new ChatPinSetVisibility(), bArr);
        }

        public ChatPinSetVisibility clear() {
            this.requestId = 0L;
            this.chatServerId = 0L;
            this.show = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            return this.show ? hd3.a(3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            boolean z = this.show;
            if (z) {
                hd3Var.r(3, z);
            }
        }

        public static ChatPinSetVisibility parseFrom(gd3 gd3Var) throws IOException {
            return new ChatPinSetVisibility().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatPinSetVisibility mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 24) {
                    this.show = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatSubscribe extends fl9 {
        private static volatile ChatSubscribe[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean subscribe;

        public ChatSubscribe() {
            clear();
        }

        public static ChatSubscribe[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatSubscribe[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatSubscribe parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatSubscribe) fl9.mergeFrom(new ChatSubscribe(), bArr);
        }

        public ChatSubscribe clear() {
            this.requestId = 0L;
            this.chatServerId = 0L;
            this.subscribe = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            return this.subscribe ? hd3.a(4) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            boolean z = this.subscribe;
            if (z) {
                hd3Var.r(4, z);
            }
        }

        public static ChatSubscribe parseFrom(gd3 gd3Var) throws IOException {
            return new ChatSubscribe().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatSubscribe mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 32) {
                    this.subscribe = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ChatUpdate extends fl9 {
        private static volatile ChatUpdate[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public Rect crop;
        public String description;
        public boolean descriptionIsNull;
        public boolean notifyPin;
        public String photoToken;
        public boolean photoTokenIsNull;
        public long pinMessageId;
        public boolean pinMessageIdIsNull;
        public long requestId;
        public String theme;
        public boolean themeIsNull;

        public ChatUpdate() {
            clear();
        }

        public static ChatUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatUpdate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatUpdate) fl9.mergeFrom(new ChatUpdate(), bArr);
        }

        public ChatUpdate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.theme = "";
            this.photoToken = "";
            this.crop = null;
            this.themeIsNull = false;
            this.photoTokenIsNull = false;
            this.pinMessageId = 0L;
            this.notifyPin = false;
            this.pinMessageIdIsNull = false;
            this.description = "";
            this.descriptionIsNull = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            if (!this.theme.equals("")) {
                iH += hd3.l(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                iH += hd3.l(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += hd3.i(6, rect);
            }
            if (this.themeIsNull) {
                iH += hd3.a(7);
            }
            if (this.photoTokenIsNull) {
                iH += hd3.a(8);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                iH += hd3.h(9, j4);
            }
            if (this.notifyPin) {
                iH += hd3.a(10);
            }
            if (this.pinMessageIdIsNull) {
                iH += hd3.a(11);
            }
            if (!this.description.equals("")) {
                iH += hd3.l(12, this.description);
            }
            return this.descriptionIsNull ? hd3.a(13) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            if (!this.theme.equals("")) {
                hd3Var.E(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                hd3Var.E(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                hd3Var.y(6, rect);
            }
            boolean z = this.themeIsNull;
            if (z) {
                hd3Var.r(7, z);
            }
            boolean z2 = this.photoTokenIsNull;
            if (z2) {
                hd3Var.r(8, z2);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                hd3Var.x(9, j4);
            }
            boolean z3 = this.notifyPin;
            if (z3) {
                hd3Var.r(10, z3);
            }
            boolean z4 = this.pinMessageIdIsNull;
            if (z4) {
                hd3Var.r(11, z4);
            }
            if (!this.description.equals("")) {
                hd3Var.E(12, this.description);
            }
            boolean z5 = this.descriptionIsNull;
            if (z5) {
                hd3Var.r(13, z5);
            }
        }

        public static ChatUpdate parseFrom(gd3 gd3Var) throws IOException {
            return new ChatUpdate().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatUpdate mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = gd3Var.q();
                        break;
                    case 16:
                        this.chatId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.chatServerId = gd3Var.q();
                        break;
                    case 34:
                        this.theme = gd3Var.r();
                        break;
                    case 42:
                        this.photoToken = gd3Var.r();
                        break;
                    case 50:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        gd3Var.j(this.crop);
                        break;
                    case 56:
                        this.themeIsNull = gd3Var.f();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.photoTokenIsNull = gd3Var.f();
                        break;
                    case 72:
                        this.pinMessageId = gd3Var.q();
                        break;
                    case 80:
                        this.notifyPin = gd3Var.f();
                        break;
                    case 88:
                        this.pinMessageIdIsNull = gd3Var.f();
                        break;
                    case 98:
                        this.description = gd3Var.r();
                        break;
                    case 104:
                        this.descriptionIsNull = gd3Var.f();
                        break;
                    default:
                        if (!gd3Var.u(iS)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class ChatsList extends fl9 {
        private static volatile ChatsList[] _emptyArray;
        public long chatsSync;
        public int count;
        public long marker;
        public long requestId;

        public ChatsList() {
            clear();
        }

        public static ChatsList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatsList[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatsList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatsList) fl9.mergeFrom(new ChatsList(), bArr);
        }

        public ChatsList clear() {
            this.requestId = 0L;
            this.marker = 0L;
            this.count = 0;
            this.chatsSync = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.marker;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                iH += hd3.f(3, i);
            }
            long j3 = this.chatsSync;
            return j3 != 0 ? hd3.h(4, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.marker;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                hd3Var.w(3, i);
            }
            long j3 = this.chatsSync;
            if (j3 != 0) {
                hd3Var.x(4, j3);
            }
        }

        public static ChatsList parseFrom(gd3 gd3Var) throws IOException {
            return new ChatsList().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ChatsList mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.marker = gd3Var.q();
                } else if (iS == 24) {
                    this.count = gd3Var.p();
                } else if (iS == 32) {
                    this.chatsSync = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class Complain extends fl9 {
        private static volatile Complain[] _emptyArray;
        public String details;
        public long[] ids;
        public long parentId;
        public int reasonId;
        public long requestId;
        public long[] serverIds;
        public int typeId;

        public Complain() {
            clear();
        }

        public static Complain[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Complain[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Complain parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Complain) fl9.mergeFrom(new Complain(), bArr);
        }

        public Complain clear() {
            this.requestId = 0L;
            this.typeId = 0;
            this.reasonId = 0;
            long[] jArr = coi.b;
            this.ids = jArr;
            this.serverIds = jArr;
            this.parentId = 0L;
            this.details = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            int i2 = this.typeId;
            if (i2 != 0) {
                iH += hd3.f(2, i2);
            }
            int i3 = this.reasonId;
            if (i3 != 0) {
                iH += hd3.f(3, i3);
            }
            long[] jArr3 = this.ids;
            if (jArr3 != null && jArr3.length > 0) {
                int i4 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.ids;
                    if (i4 >= jArr2.length) {
                        break;
                    }
                    iK += hd3.k(jArr2[i4]);
                    i4++;
                }
                iH = iH + iK + jArr2.length;
            }
            long[] jArr4 = this.serverIds;
            if (jArr4 != null && jArr4.length > 0) {
                int iK2 = 0;
                while (true) {
                    jArr = this.serverIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK2 += hd3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK2 + jArr.length;
            }
            long j2 = this.parentId;
            if (j2 != 0) {
                iH += hd3.h(6, j2);
            }
            return !this.details.equals("") ? hd3.l(7, this.details) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            int i = this.typeId;
            if (i != 0) {
                hd3Var.w(2, i);
            }
            int i2 = this.reasonId;
            if (i2 != 0) {
                hd3Var.w(3, i2);
            }
            long[] jArr = this.ids;
            int i3 = 0;
            if (jArr != null && jArr.length > 0) {
                int i4 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i4 >= jArr2.length) {
                        break;
                    }
                    hd3Var.x(4, jArr2[i4]);
                    i4++;
                }
            }
            long[] jArr3 = this.serverIds;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.serverIds;
                    if (i3 >= jArr4.length) {
                        break;
                    }
                    hd3Var.x(5, jArr4[i3]);
                    i3++;
                }
            }
            long j2 = this.parentId;
            if (j2 != 0) {
                hd3Var.x(6, j2);
            }
            if (this.details.equals("")) {
                return;
            }
            hd3Var.E(7, this.details);
        }

        public static Complain parseFrom(gd3 gd3Var) throws IOException {
            return new Complain().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public Complain mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.typeId = gd3Var.p();
                } else if (iS == 24) {
                    this.reasonId = gd3Var.p();
                } else if (iS == 32) {
                    int iB = coi.b(gd3Var, 32);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iB + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = gd3Var.q();
                        gd3Var.s();
                        length++;
                    }
                    jArr2[length] = gd3Var.q();
                    this.ids = jArr2;
                } else if (iS == 34) {
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i2++;
                    }
                    gd3Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = gd3Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    gd3Var.d(iE);
                } else if (iS == 40) {
                    int iB2 = coi.b(gd3Var, 40);
                    long[] jArr5 = this.serverIds;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i4 = iB2 + length3;
                    long[] jArr6 = new long[i4];
                    if (length3 != 0) {
                        System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        jArr6[length3] = gd3Var.q();
                        gd3Var.s();
                        length3++;
                    }
                    jArr6[length3] = gd3Var.q();
                    this.serverIds = jArr6;
                } else if (iS == 42) {
                    int iE2 = gd3Var.e(gd3Var.p());
                    int iC2 = gd3Var.c();
                    int i5 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i5++;
                    }
                    gd3Var.t(iC2);
                    long[] jArr7 = this.serverIds;
                    int length4 = jArr7 == null ? 0 : jArr7.length;
                    int i6 = i5 + length4;
                    long[] jArr8 = new long[i6];
                    if (length4 != 0) {
                        System.arraycopy(jArr7, 0, jArr8, 0, length4);
                    }
                    while (length4 < i6) {
                        jArr8[length4] = gd3Var.q();
                        length4++;
                    }
                    this.serverIds = jArr8;
                    gd3Var.d(iE2);
                } else if (iS == 48) {
                    this.parentId = gd3Var.q();
                } else if (iS == 58) {
                    this.details = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class Config extends fl9 {
        private static volatile Config[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean isPushToken;
        public boolean isUserSettings;
        public long requestId;
        public boolean reset;
        public long[] syncChatIds;
        public Map<String, String> userSettings;

        public Config() {
            clear();
        }

        public static Config[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Config[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Config) fl9.mergeFrom(new Config(), bArr);
        }

        public Config clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.isPushToken = false;
            this.isUserSettings = false;
            this.userSettings = null;
            this.reset = false;
            this.syncChatIds = coi.b;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            if (this.isPushToken) {
                iH += hd3.a(4);
            }
            if (this.isUserSettings) {
                iH += hd3.a(5);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                iH += kp7.a(map, 6, 9, 9);
            }
            if (this.reset) {
                iH += hd3.a(7);
            }
            long[] jArr = this.syncChatIds;
            if (jArr == null || jArr.length <= 0) {
                return iH;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.syncChatIds;
                if (i >= jArr2.length) {
                    return iH + iK + jArr2.length;
                }
                iK += hd3.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.fl9
        public Config mergeFrom(gd3 gd3Var) throws IOException {
            gd3 gd3Var2;
            tn8 tn8Var = jei.a;
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    gd3Var2 = gd3Var;
                    this.requestId = gd3Var2.q();
                } else if (iS == 16) {
                    gd3Var2 = gd3Var;
                    this.chatId = gd3Var2.q();
                } else if (iS == 24) {
                    gd3Var2 = gd3Var;
                    this.chatServerId = gd3Var2.q();
                } else if (iS == 32) {
                    gd3Var2 = gd3Var;
                    this.isPushToken = gd3Var2.f();
                } else if (iS == 40) {
                    gd3Var2 = gd3Var;
                    this.isUserSettings = gd3Var2.f();
                } else if (iS != 50) {
                    if (iS == 56) {
                        this.reset = gd3Var.f();
                    } else if (iS == 64) {
                        int iB = coi.b(gd3Var, 64);
                        long[] jArr = this.syncChatIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.syncChatIds = jArr2;
                    } else if (iS == 66) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.syncChatIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.syncChatIds = jArr4;
                        gd3Var.d(iE);
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                    gd3Var2 = gd3Var;
                } else {
                    gd3Var2 = gd3Var;
                    this.userSettings = kp7.b(gd3Var2, this.userSettings, tn8Var, 9, 9, null, 10, 18);
                }
                gd3Var = gd3Var2;
            }
            return this;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            boolean z = this.isPushToken;
            if (z) {
                hd3Var.r(4, z);
            }
            boolean z2 = this.isUserSettings;
            if (z2) {
                hd3Var.r(5, z2);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                kp7.d(hd3Var, map, 6, 9, 9);
            }
            boolean z3 = this.reset;
            if (z3) {
                hd3Var.r(7, z3);
            }
            long[] jArr = this.syncChatIds;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                long[] jArr2 = this.syncChatIds;
                if (i >= jArr2.length) {
                    return;
                }
                hd3Var.x(8, jArr2[i]);
                i++;
            }
        }

        public static Config parseFrom(gd3 gd3Var) throws IOException {
            return new Config().mergeFrom(gd3Var);
        }
    }

    public static final class ConfirmPresent extends fl9 {
        private static volatile ConfirmPresent[] _emptyArray;
        public boolean accept;
        public boolean asPrivate;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long metadataId;
        public long presentId;
        public long requestId;

        public ConfirmPresent() {
            clear();
        }

        public static ConfirmPresent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ConfirmPresent[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ConfirmPresent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ConfirmPresent) fl9.mergeFrom(new ConfirmPresent(), bArr);
        }

        public ConfirmPresent clear() {
            this.requestId = 0L;
            this.presentId = 0L;
            this.metadataId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.messageId = 0L;
            this.messageServerId = 0L;
            this.accept = false;
            this.asPrivate = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.presentId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.metadataId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.chatServerId;
            if (j5 != 0) {
                iH += hd3.h(5, j5);
            }
            long j6 = this.messageId;
            if (j6 != 0) {
                iH += hd3.h(6, j6);
            }
            long j7 = this.messageServerId;
            if (j7 != 0) {
                iH += hd3.h(7, j7);
            }
            if (this.accept) {
                iH += hd3.a(8);
            }
            return this.asPrivate ? hd3.a(9) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.presentId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.metadataId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.chatServerId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
            long j6 = this.messageId;
            if (j6 != 0) {
                hd3Var.x(6, j6);
            }
            long j7 = this.messageServerId;
            if (j7 != 0) {
                hd3Var.x(7, j7);
            }
            boolean z = this.accept;
            if (z) {
                hd3Var.r(8, z);
            }
            boolean z2 = this.asPrivate;
            if (z2) {
                hd3Var.r(9, z2);
            }
        }

        public static ConfirmPresent parseFrom(gd3 gd3Var) throws IOException {
            return new ConfirmPresent().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ConfirmPresent mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.presentId = gd3Var.q();
                } else if (iS == 24) {
                    this.metadataId = gd3Var.q();
                } else if (iS == 32) {
                    this.chatId = gd3Var.q();
                } else if (iS == 40) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 48) {
                    this.messageId = gd3Var.q();
                } else if (iS == 56) {
                    this.messageServerId = gd3Var.q();
                } else if (iS == 64) {
                    this.accept = gd3Var.f();
                } else if (iS == 72) {
                    this.asPrivate = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class CongratsStatus extends fl9 {
        private static volatile CongratsStatus[] _emptyArray;
        public String holidayId;
        public long requestId;
        public boolean status;
        public long userId;

        public CongratsStatus() {
            clear();
        }

        public static CongratsStatus[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CongratsStatus[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static CongratsStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CongratsStatus) fl9.mergeFrom(new CongratsStatus(), bArr);
        }

        public CongratsStatus clear() {
            this.requestId = 0L;
            this.userId = 0L;
            this.status = false;
            this.holidayId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.userId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            if (this.status) {
                iH += hd3.a(3);
            }
            return !this.holidayId.equals("") ? hd3.l(4, this.holidayId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            boolean z = this.status;
            if (z) {
                hd3Var.r(3, z);
            }
            if (this.holidayId.equals("")) {
                return;
            }
            hd3Var.E(4, this.holidayId);
        }

        public static CongratsStatus parseFrom(gd3 gd3Var) throws IOException {
            return new CongratsStatus().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public CongratsStatus mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.userId = gd3Var.q();
                } else if (iS == 24) {
                    this.status = gd3Var.f();
                } else if (iS == 34) {
                    this.holidayId = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ContactUpdate extends fl9 {
        private static volatile ContactUpdate[] _emptyArray;
        public String action;
        public long contactId;
        public String lastName;
        public String newName;
        public String oldLastName;
        public String oldName;
        public long requestId;

        public ContactUpdate() {
            clear();
        }

        public static ContactUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactUpdate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactUpdate) fl9.mergeFrom(new ContactUpdate(), bArr);
        }

        public ContactUpdate clear() {
            this.requestId = 0L;
            this.contactId = 0L;
            this.action = "";
            this.oldName = "";
            this.newName = "";
            this.lastName = "";
            this.oldLastName = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            if (!this.action.equals("")) {
                iH += hd3.l(3, this.action);
            }
            if (!this.oldName.equals("")) {
                iH += hd3.l(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                iH += hd3.l(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                iH += hd3.l(6, this.lastName);
            }
            return !this.oldLastName.equals("") ? hd3.l(7, this.oldLastName) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (!this.action.equals("")) {
                hd3Var.E(3, this.action);
            }
            if (!this.oldName.equals("")) {
                hd3Var.E(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                hd3Var.E(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                hd3Var.E(6, this.lastName);
            }
            if (this.oldLastName.equals("")) {
                return;
            }
            hd3Var.E(7, this.oldLastName);
        }

        public static ContactUpdate parseFrom(gd3 gd3Var) throws IOException {
            return new ContactUpdate().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ContactUpdate mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.contactId = gd3Var.q();
                } else if (iS == 26) {
                    this.action = gd3Var.r();
                } else if (iS == 34) {
                    this.oldName = gd3Var.r();
                } else if (iS == 42) {
                    this.newName = gd3Var.r();
                } else if (iS == 50) {
                    this.lastName = gd3Var.r();
                } else if (iS == 58) {
                    this.oldLastName = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ContactVerify extends fl9 {
        private static volatile ContactVerify[] _emptyArray;
        public boolean confirm;
        public long contactId;
        public String localName;
        public long requestId;

        public ContactVerify() {
            clear();
        }

        public static ContactVerify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactVerify[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactVerify) fl9.mergeFrom(new ContactVerify(), bArr);
        }

        public ContactVerify clear() {
            this.requestId = 0L;
            this.contactId = 0L;
            this.localName = "";
            this.confirm = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            if (!this.localName.equals("")) {
                iH += hd3.l(3, this.localName);
            }
            return this.confirm ? hd3.a(4) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (!this.localName.equals("")) {
                hd3Var.E(3, this.localName);
            }
            boolean z = this.confirm;
            if (z) {
                hd3Var.r(4, z);
            }
        }

        public static ContactVerify parseFrom(gd3 gd3Var) throws IOException {
            return new ContactVerify().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ContactVerify mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.contactId = gd3Var.q();
                } else if (iS == 26) {
                    this.localName = gd3Var.r();
                } else if (iS == 32) {
                    this.confirm = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class CritLog extends fl9 {
        private static volatile CritLog[] _emptyArray;
        public String event;
        public byte[] params;
        public long requestId;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public CritLog() {
            clear();
        }

        public static CritLog[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CritLog[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static CritLog parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CritLog) fl9.mergeFrom(new CritLog(), bArr);
        }

        public CritLog clear() {
            this.requestId = 0L;
            this.time = 0L;
            this.userId = 0L;
            this.sessionId = 0L;
            this.type = "";
            this.event = "";
            this.params = coi.e;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.time;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.userId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.sessionId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            if (!this.type.equals("")) {
                iH += hd3.l(5, this.type);
            }
            if (!this.event.equals("")) {
                iH += hd3.l(6, this.event);
            }
            return !Arrays.equals(this.params, coi.e) ? hd3.b(7, this.params) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.time;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.userId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.sessionId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            if (!this.type.equals("")) {
                hd3Var.E(5, this.type);
            }
            if (!this.event.equals("")) {
                hd3Var.E(6, this.event);
            }
            if (Arrays.equals(this.params, coi.e)) {
                return;
            }
            hd3Var.s(7, this.params);
        }

        public static CritLog parseFrom(gd3 gd3Var) throws IOException {
            return new CritLog().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public CritLog mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.time = gd3Var.q();
                } else if (iS == 24) {
                    this.userId = gd3Var.q();
                } else if (iS == 32) {
                    this.sessionId = gd3Var.q();
                } else if (iS == 42) {
                    this.type = gd3Var.r();
                } else if (iS == 50) {
                    this.event = gd3Var.r();
                } else if (iS == 58) {
                    this.params = gd3Var.g();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class DraftDiscard extends fl9 {
        private static volatile DraftDiscard[] _emptyArray;
        public long chatId;
        public long requestId;
        public long serverTime;

        public DraftDiscard() {
            clear();
        }

        public static DraftDiscard[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DraftDiscard[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static DraftDiscard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DraftDiscard) fl9.mergeFrom(new DraftDiscard(), bArr);
        }

        public DraftDiscard clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.serverTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.serverTime;
            return j3 != 0 ? hd3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.serverTime;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
        }

        public static DraftDiscard parseFrom(gd3 gd3Var) throws IOException {
            return new DraftDiscard().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public DraftDiscard mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.serverTime = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class DraftSave extends fl9 {
        private static volatile DraftSave[] _emptyArray;
        public long chatId;
        public byte[] draft;
        public long requestId;

        public DraftSave() {
            clear();
        }

        public static DraftSave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DraftSave[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static DraftSave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DraftSave) fl9.mergeFrom(new DraftSave(), bArr);
        }

        public DraftSave clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.draft = coi.e;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            return !Arrays.equals(this.draft, coi.e) ? hd3.b(3, this.draft) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (Arrays.equals(this.draft, coi.e)) {
                return;
            }
            hd3Var.s(3, this.draft);
        }

        public static DraftSave parseFrom(gd3 gd3Var) throws IOException {
            return new DraftSave().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public DraftSave mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 26) {
                    this.draft = gd3Var.g();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class ExternalVideoSend extends fl9 {
        private static volatile ExternalVideoSend[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public String externalUrl;
        public long messageId;
        public long requestId;
        public String stickerId;

        public ExternalVideoSend() {
            clear();
        }

        public static ExternalVideoSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ExternalVideoSend[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ExternalVideoSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ExternalVideoSend) fl9.mergeFrom(new ExternalVideoSend(), bArr);
        }

        public ExternalVideoSend clear() {
            this.requestId = 0L;
            this.externalUrl = "";
            this.attachLocalId = "";
            this.messageId = 0L;
            this.chatId = 0L;
            this.stickerId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.externalUrl.equals("")) {
                iH += hd3.l(2, this.externalUrl);
            }
            if (!this.attachLocalId.equals("")) {
                iH += hd3.l(3, this.attachLocalId);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += hd3.h(5, j3);
            }
            return !this.stickerId.equals("") ? hd3.l(6, this.stickerId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.externalUrl.equals("")) {
                hd3Var.E(2, this.externalUrl);
            }
            if (!this.attachLocalId.equals("")) {
                hd3Var.E(3, this.attachLocalId);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
            if (this.stickerId.equals("")) {
                return;
            }
            hd3Var.E(6, this.stickerId);
        }

        public static ExternalVideoSend parseFrom(gd3 gd3Var) throws IOException {
            return new ExternalVideoSend().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ExternalVideoSend mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.externalUrl = gd3Var.r();
                } else if (iS == 26) {
                    this.attachLocalId = gd3Var.r();
                } else if (iS == 32) {
                    this.messageId = gd3Var.q();
                } else if (iS == 40) {
                    this.chatId = gd3Var.q();
                } else if (iS == 50) {
                    this.stickerId = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class FileDownload extends fl9 {
        private static volatile FileDownload[] _emptyArray;
        public String attachId;
        public String attachType;
        public long audioId;
        public boolean checkAutoloadConnection;
        public long fileId;
        public String fileName;
        public int invalidateCount;
        public long messageId;
        public long mp4GifId;
        public boolean notCopyVideoToGallery;
        public boolean notifyProgress;
        public long requestId;
        public long stickerId;
        public String url;
        public boolean useOriginalExtension;
        public long videoId;

        public FileDownload() {
            clear();
        }

        public static FileDownload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownload) fl9.mergeFrom(new FileDownload(), bArr);
        }

        public FileDownload clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.videoId = 0L;
            this.audioId = 0L;
            this.mp4GifId = 0L;
            this.url = "";
            this.attachId = "";
            this.notifyProgress = false;
            this.stickerId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.checkAutoloadConnection = false;
            this.invalidateCount = 0;
            this.useOriginalExtension = false;
            this.notCopyVideoToGallery = false;
            this.attachType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.videoId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.mp4GifId;
            if (j5 != 0) {
                iH += hd3.h(5, j5);
            }
            if (!this.url.equals("")) {
                iH += hd3.l(6, this.url);
            }
            if (!this.attachId.equals("")) {
                iH += hd3.l(7, this.attachId);
            }
            if (this.notifyProgress) {
                iH += hd3.a(8);
            }
            long j6 = this.stickerId;
            if (j6 != 0) {
                iH += hd3.h(9, j6);
            }
            long j7 = this.fileId;
            if (j7 != 0) {
                iH += hd3.h(10, j7);
            }
            if (!this.fileName.equals("")) {
                iH += hd3.l(11, this.fileName);
            }
            if (this.checkAutoloadConnection) {
                iH += hd3.a(12);
            }
            int i = this.invalidateCount;
            if (i != 0) {
                iH += hd3.f(13, i);
            }
            if (this.useOriginalExtension) {
                iH += hd3.a(14);
            }
            if (this.notCopyVideoToGallery) {
                iH += hd3.a(15);
            }
            return !this.attachType.equals("") ? hd3.l(16, this.attachType) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.videoId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.mp4GifId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
            if (!this.url.equals("")) {
                hd3Var.E(6, this.url);
            }
            if (!this.attachId.equals("")) {
                hd3Var.E(7, this.attachId);
            }
            boolean z = this.notifyProgress;
            if (z) {
                hd3Var.r(8, z);
            }
            long j6 = this.stickerId;
            if (j6 != 0) {
                hd3Var.x(9, j6);
            }
            long j7 = this.fileId;
            if (j7 != 0) {
                hd3Var.x(10, j7);
            }
            if (!this.fileName.equals("")) {
                hd3Var.E(11, this.fileName);
            }
            boolean z2 = this.checkAutoloadConnection;
            if (z2) {
                hd3Var.r(12, z2);
            }
            int i = this.invalidateCount;
            if (i != 0) {
                hd3Var.w(13, i);
            }
            boolean z3 = this.useOriginalExtension;
            if (z3) {
                hd3Var.r(14, z3);
            }
            boolean z4 = this.notCopyVideoToGallery;
            if (z4) {
                hd3Var.r(15, z4);
            }
            if (this.attachType.equals("")) {
                return;
            }
            hd3Var.E(16, this.attachType);
        }

        public static FileDownload parseFrom(gd3 gd3Var) throws IOException {
            return new FileDownload().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public FileDownload mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = gd3Var.q();
                        break;
                    case 16:
                        this.messageId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.videoId = gd3Var.q();
                        break;
                    case 32:
                        this.audioId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.mp4GifId = gd3Var.q();
                        break;
                    case 50:
                        this.url = gd3Var.r();
                        break;
                    case 58:
                        this.attachId = gd3Var.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.notifyProgress = gd3Var.f();
                        break;
                    case 72:
                        this.stickerId = gd3Var.q();
                        break;
                    case 80:
                        this.fileId = gd3Var.q();
                        break;
                    case 90:
                        this.fileName = gd3Var.r();
                        break;
                    case 96:
                        this.checkAutoloadConnection = gd3Var.f();
                        break;
                    case 104:
                        this.invalidateCount = gd3Var.p();
                        break;
                    case 112:
                        this.useOriginalExtension = gd3Var.f();
                        break;
                    case 120:
                        this.notCopyVideoToGallery = gd3Var.f();
                        break;
                    case 130:
                        this.attachType = gd3Var.r();
                        break;
                    default:
                        if (!gd3Var.u(iS)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class FileDownloadCmd extends fl9 {
        private static volatile FileDownloadCmd[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public long fileId;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileDownloadCmd() {
            clear();
        }

        public static FileDownloadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownloadCmd[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownloadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownloadCmd) fl9.mergeFrom(new FileDownloadCmd(), bArr);
        }

        public FileDownloadCmd clear() {
            this.requestId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.messageId = 0L;
            this.attachLocalId = "";
            this.chatId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.fileId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            if (!this.fileName.equals("")) {
                iH += hd3.l(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(4, j3);
            }
            if (!this.attachLocalId.equals("")) {
                iH += hd3.l(5, this.attachLocalId);
            }
            long j4 = this.chatId;
            return j4 != 0 ? hd3.h(6, j4) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.fileId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            if (!this.fileName.equals("")) {
                hd3Var.E(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(4, j3);
            }
            if (!this.attachLocalId.equals("")) {
                hd3Var.E(5, this.attachLocalId);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                hd3Var.x(6, j4);
            }
        }

        public static FileDownloadCmd parseFrom(gd3 gd3Var) throws IOException {
            return new FileDownloadCmd().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public FileDownloadCmd mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.fileId = gd3Var.q();
                } else if (iS == 26) {
                    this.fileName = gd3Var.r();
                } else if (iS == 32) {
                    this.messageId = gd3Var.q();
                } else if (iS == 42) {
                    this.attachLocalId = gd3Var.r();
                } else if (iS == 48) {
                    this.chatId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class FileUpload extends fl9 {
        private static volatile FileUpload[] _emptyArray;
        public String attachLocalId;
        public int attachType;
        public long audioId;
        public long chatId;
        public Rect crop;
        public String file;
        public long fileId;
        public String fileName;
        public long lastUpdatedFile;
        public long lastUpdatedOriginalFile;
        public long messageId;
        public String originalFile;
        public boolean profile;
        public long requestId;
        public String url;
        public long videoId;

        public FileUpload() {
            clear();
        }

        public static FileUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileUpload) fl9.mergeFrom(new FileUpload(), bArr);
        }

        public FileUpload clear() {
            this.requestId = 0L;
            this.file = "";
            this.url = "";
            this.messageId = 0L;
            this.chatId = 0L;
            this.profile = false;
            this.crop = null;
            this.audioId = 0L;
            this.videoId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.originalFile = "";
            this.lastUpdatedFile = 0L;
            this.lastUpdatedOriginalFile = 0L;
            this.attachType = 0;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += hd3.l(2, this.file);
            }
            if (!this.url.equals("")) {
                iH += hd3.l(3, this.url);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += hd3.h(5, j3);
            }
            if (this.profile) {
                iH += hd3.a(6);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += hd3.i(7, rect);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                iH += hd3.h(8, j4);
            }
            long j5 = this.videoId;
            if (j5 != 0) {
                iH += hd3.h(9, j5);
            }
            long j6 = this.fileId;
            if (j6 != 0) {
                iH += hd3.h(10, j6);
            }
            if (!this.fileName.equals("")) {
                iH += hd3.l(11, this.fileName);
            }
            if (!this.originalFile.equals("")) {
                iH += hd3.l(12, this.originalFile);
            }
            long j7 = this.lastUpdatedFile;
            if (j7 != 0) {
                iH += hd3.h(13, j7);
            }
            long j8 = this.lastUpdatedOriginalFile;
            if (j8 != 0) {
                iH += hd3.h(14, j8);
            }
            int i = this.attachType;
            if (i != 0) {
                iH += hd3.f(15, i);
            }
            return !this.attachLocalId.equals("") ? hd3.l(16, this.attachLocalId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                hd3Var.E(2, this.file);
            }
            if (!this.url.equals("")) {
                hd3Var.E(3, this.url);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
            boolean z = this.profile;
            if (z) {
                hd3Var.r(6, z);
            }
            Rect rect = this.crop;
            if (rect != null) {
                hd3Var.y(7, rect);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                hd3Var.x(8, j4);
            }
            long j5 = this.videoId;
            if (j5 != 0) {
                hd3Var.x(9, j5);
            }
            long j6 = this.fileId;
            if (j6 != 0) {
                hd3Var.x(10, j6);
            }
            if (!this.fileName.equals("")) {
                hd3Var.E(11, this.fileName);
            }
            if (!this.originalFile.equals("")) {
                hd3Var.E(12, this.originalFile);
            }
            long j7 = this.lastUpdatedFile;
            if (j7 != 0) {
                hd3Var.x(13, j7);
            }
            long j8 = this.lastUpdatedOriginalFile;
            if (j8 != 0) {
                hd3Var.x(14, j8);
            }
            int i = this.attachType;
            if (i != 0) {
                hd3Var.w(15, i);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            hd3Var.E(16, this.attachLocalId);
        }

        public static FileUpload parseFrom(gd3 gd3Var) throws IOException {
            return new FileUpload().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public FileUpload mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = gd3Var.q();
                        break;
                    case 18:
                        this.file = gd3Var.r();
                        break;
                    case 26:
                        this.url = gd3Var.r();
                        break;
                    case 32:
                        this.messageId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.chatId = gd3Var.q();
                        break;
                    case 48:
                        this.profile = gd3Var.f();
                        break;
                    case 58:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        gd3Var.j(this.crop);
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.audioId = gd3Var.q();
                        break;
                    case 72:
                        this.videoId = gd3Var.q();
                        break;
                    case 80:
                        this.fileId = gd3Var.q();
                        break;
                    case 90:
                        this.fileName = gd3Var.r();
                        break;
                    case 98:
                        this.originalFile = gd3Var.r();
                        break;
                    case 104:
                        this.lastUpdatedFile = gd3Var.q();
                        break;
                    case 112:
                        this.lastUpdatedOriginalFile = gd3Var.q();
                        break;
                    case 120:
                        this.attachType = gd3Var.p();
                        break;
                    case 130:
                        this.attachLocalId = gd3Var.r();
                        break;
                    default:
                        if (!gd3Var.u(iS)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class FileUploadCmd extends fl9 {
        private static volatile FileUploadCmd[] _emptyArray;
        public String attachLocalId;
        public String file;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileUploadCmd() {
            clear();
        }

        public static FileUploadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileUploadCmd[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileUploadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileUploadCmd) fl9.mergeFrom(new FileUploadCmd(), bArr);
        }

        public FileUploadCmd clear() {
            this.requestId = 0L;
            this.file = "";
            this.messageId = 0L;
            this.fileName = "";
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += hd3.l(2, this.file);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            if (!this.fileName.equals("")) {
                iH += hd3.l(4, this.fileName);
            }
            return !this.attachLocalId.equals("") ? hd3.l(5, this.attachLocalId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                hd3Var.E(2, this.file);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            if (!this.fileName.equals("")) {
                hd3Var.E(4, this.fileName);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            hd3Var.E(5, this.attachLocalId);
        }

        public static FileUploadCmd parseFrom(gd3 gd3Var) throws IOException {
            return new FileUploadCmd().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public FileUploadCmd mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.file = gd3Var.r();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (iS == 34) {
                    this.fileName = gd3Var.r();
                } else if (iS == 42) {
                    this.attachLocalId = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class InvalidateAndDownloadAudio extends fl9 {
        private static volatile InvalidateAndDownloadAudio[] _emptyArray;
        public long chatServerId;
        public FileDownload fileDownload;
        public String outputPath;
        public long requestId;
        public long serverMessageId;

        public InvalidateAndDownloadAudio() {
            clear();
        }

        public static InvalidateAndDownloadAudio[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new InvalidateAndDownloadAudio[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static InvalidateAndDownloadAudio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (InvalidateAndDownloadAudio) fl9.mergeFrom(new InvalidateAndDownloadAudio(), bArr);
        }

        public InvalidateAndDownloadAudio clear() {
            this.requestId = 0L;
            this.outputPath = "";
            this.chatServerId = 0L;
            this.serverMessageId = 0L;
            this.fileDownload = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.outputPath.equals("")) {
                iH += hd3.l(2, this.outputPath);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            long j3 = this.serverMessageId;
            if (j3 != 0) {
                iH += hd3.h(4, j3);
            }
            FileDownload fileDownload = this.fileDownload;
            return fileDownload != null ? hd3.i(5, fileDownload) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.outputPath.equals("")) {
                hd3Var.E(2, this.outputPath);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            long j3 = this.serverMessageId;
            if (j3 != 0) {
                hd3Var.x(4, j3);
            }
            FileDownload fileDownload = this.fileDownload;
            if (fileDownload != null) {
                hd3Var.y(5, fileDownload);
            }
        }

        public static InvalidateAndDownloadAudio parseFrom(gd3 gd3Var) throws IOException {
            return new InvalidateAndDownloadAudio().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public InvalidateAndDownloadAudio mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.outputPath = gd3Var.r();
                } else if (iS == 24) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 32) {
                    this.serverMessageId = gd3Var.q();
                } else if (iS == 42) {
                    if (this.fileDownload == null) {
                        this.fileDownload = new FileDownload();
                    }
                    gd3Var.j(this.fileDownload);
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class LocationRequest extends fl9 {
        private static volatile LocationRequest[] _emptyArray;
        public boolean liveLocation;
        public long messageId;
        public long requestId;

        public LocationRequest() {
            clear();
        }

        public static LocationRequest[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationRequest[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationRequest) fl9.mergeFrom(new LocationRequest(), bArr);
        }

        public LocationRequest clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.liveLocation = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            return this.liveLocation ? hd3.a(3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            boolean z = this.liveLocation;
            if (z) {
                hd3Var.r(3, z);
            }
        }

        public static LocationRequest parseFrom(gd3 gd3Var) throws IOException {
            return new LocationRequest().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public LocationRequest mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.messageId = gd3Var.q();
                } else if (iS == 24) {
                    this.liveLocation = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class LocationStop extends fl9 {
        private static volatile LocationStop[] _emptyArray;
        public long chatId;
        public long messageId;
        public long requestId;

        public LocationStop() {
            clear();
        }

        public static LocationStop[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationStop[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationStop parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationStop) fl9.mergeFrom(new LocationStop(), bArr);
        }

        public LocationStop clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.messageId;
            return j3 != 0 ? hd3.h(3, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
        }

        public static LocationStop parseFrom(gd3 gd3Var) throws IOException {
            return new LocationStop().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public LocationStop mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgCancelReaction extends fl9 {
        private static volatile MsgCancelReaction[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long requestId;

        public MsgCancelReaction() {
            clear();
        }

        public static MsgCancelReaction[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgCancelReaction[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgCancelReaction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgCancelReaction) fl9.mergeFrom(new MsgCancelReaction(), bArr);
        }

        public MsgCancelReaction clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.messageServerId;
            return j5 != 0 ? hd3.h(5, j5) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
        }

        public static MsgCancelReaction parseFrom(gd3 gd3Var) throws IOException {
            return new MsgCancelReaction().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgCancelReaction mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (iS == 32) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 40) {
                    this.messageServerId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgDelete extends fl9 {
        private static volatile MsgDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public String complaint;
        public boolean forMe;
        public int itemTypeId;
        public long[] messagesId;
        public long[] messagesServerId;
        public boolean notDeleteMessageFromDb;
        public long requestId;

        public MsgDelete() {
            clear();
        }

        public static MsgDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDelete[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDelete) fl9.mergeFrom(new MsgDelete(), bArr);
        }

        public MsgDelete clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            long[] jArr = coi.b;
            this.messagesId = jArr;
            this.messagesServerId = jArr;
            this.complaint = "";
            this.forMe = false;
            this.itemTypeId = 0;
            this.notDeleteMessageFromDb = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long[] jArr3 = this.messagesId;
            if (jArr3 != null && jArr3.length > 0) {
                int i2 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    iK += hd3.k(jArr2[i2]);
                    i2++;
                }
                iH = iH + iK + jArr2.length;
            }
            long[] jArr4 = this.messagesServerId;
            if (jArr4 != null && jArr4.length > 0) {
                int iK2 = 0;
                while (true) {
                    jArr = this.messagesServerId;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK2 += hd3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK2 + jArr.length;
            }
            if (!this.complaint.equals("")) {
                iH += hd3.l(6, this.complaint);
            }
            if (this.forMe) {
                iH += hd3.a(7);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                iH += hd3.f(8, i3);
            }
            return this.notDeleteMessageFromDb ? hd3.a(9) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long[] jArr = this.messagesId;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    hd3Var.x(4, jArr2[i2]);
                    i2++;
                }
            }
            long[] jArr3 = this.messagesServerId;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.messagesServerId;
                    if (i >= jArr4.length) {
                        break;
                    }
                    hd3Var.x(5, jArr4[i]);
                    i++;
                }
            }
            if (!this.complaint.equals("")) {
                hd3Var.E(6, this.complaint);
            }
            boolean z = this.forMe;
            if (z) {
                hd3Var.r(7, z);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                hd3Var.w(8, i3);
            }
            boolean z2 = this.notDeleteMessageFromDb;
            if (z2) {
                hd3Var.r(9, z2);
            }
        }

        public static MsgDelete parseFrom(gd3 gd3Var) throws IOException {
            return new MsgDelete().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgDelete mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = gd3Var.q();
                        break;
                    case 16:
                        this.chatId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.chatServerId = gd3Var.q();
                        break;
                    case 32:
                        int iB = coi.b(gd3Var, 32);
                        long[] jArr = this.messagesId;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.messagesId = jArr2;
                        break;
                    case 34:
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.messagesId;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.messagesId = jArr4;
                        gd3Var.d(iE);
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        int iB2 = coi.b(gd3Var, 40);
                        long[] jArr5 = this.messagesServerId;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = iB2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = gd3Var.q();
                            gd3Var.s();
                            length3++;
                        }
                        jArr6[length3] = gd3Var.q();
                        this.messagesServerId = jArr6;
                        break;
                    case 42:
                        int iE2 = gd3Var.e(gd3Var.p());
                        int iC2 = gd3Var.c();
                        int i5 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i5++;
                        }
                        gd3Var.t(iC2);
                        long[] jArr7 = this.messagesServerId;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = gd3Var.q();
                            length4++;
                        }
                        this.messagesServerId = jArr8;
                        gd3Var.d(iE2);
                        break;
                    case 50:
                        this.complaint = gd3Var.r();
                        break;
                    case 56:
                        this.forMe = gd3Var.f();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.itemTypeId = gd3Var.p();
                        break;
                    case 72:
                        this.notDeleteMessageFromDb = gd3Var.f();
                        break;
                    default:
                        if (!gd3Var.u(iS)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class MsgDeleteRange extends fl9 {
        private static volatile MsgDeleteRange[] _emptyArray;
        public long chatId;
        public long endTime;
        public int itemTypeId;
        public long requestId;
        public long startTime;

        public MsgDeleteRange() {
            clear();
        }

        public static MsgDeleteRange[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDeleteRange[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDeleteRange parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDeleteRange) fl9.mergeFrom(new MsgDeleteRange(), bArr);
        }

        public MsgDeleteRange clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.startTime = 0L;
            this.endTime = 0L;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            int i = this.itemTypeId;
            return i != 0 ? hd3.f(5, i) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            int i = this.itemTypeId;
            if (i != 0) {
                hd3Var.w(5, i);
            }
        }

        public static MsgDeleteRange parseFrom(gd3 gd3Var) throws IOException {
            return new MsgDeleteRange().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgDeleteRange mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.startTime = gd3Var.q();
                } else if (iS == 32) {
                    this.endTime = gd3Var.q();
                } else if (iS == 40) {
                    this.itemTypeId = gd3Var.p();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgEdit extends fl9 {
        private static volatile MsgEdit[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean editAttaches;
        public long messageId;
        public long messageServerId;
        public Protos.Attaches oldAttaches;
        public Protos.MessageElements oldElements;
        public int oldStatus;
        public String oldText;
        public long requestId;
        public String text;

        public MsgEdit() {
            clear();
        }

        public static MsgEdit[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgEdit[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgEdit parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgEdit) fl9.mergeFrom(new MsgEdit(), bArr);
        }

        public MsgEdit clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.text = "";
            this.oldText = "";
            this.oldStatus = 0;
            this.oldAttaches = null;
            this.editAttaches = false;
            this.oldElements = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += hd3.h(5, j5);
            }
            if (!this.text.equals("")) {
                iH += hd3.l(6, this.text);
            }
            if (!this.oldText.equals("")) {
                iH += hd3.l(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                iH += hd3.f(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                iH += hd3.i(9, attaches);
            }
            if (this.editAttaches) {
                iH += hd3.a(10);
            }
            Protos.MessageElements messageElements = this.oldElements;
            return messageElements != null ? hd3.i(11, messageElements) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
            if (!this.text.equals("")) {
                hd3Var.E(6, this.text);
            }
            if (!this.oldText.equals("")) {
                hd3Var.E(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                hd3Var.w(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                hd3Var.y(9, attaches);
            }
            boolean z = this.editAttaches;
            if (z) {
                hd3Var.r(10, z);
            }
            Protos.MessageElements messageElements = this.oldElements;
            if (messageElements != null) {
                hd3Var.y(11, messageElements);
            }
        }

        public static MsgEdit parseFrom(gd3 gd3Var) throws IOException {
            return new MsgEdit().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgEdit mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.requestId = gd3Var.q();
                        break;
                    case 16:
                        this.chatId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.messageId = gd3Var.q();
                        break;
                    case 32:
                        this.chatServerId = gd3Var.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.messageServerId = gd3Var.q();
                        break;
                    case 50:
                        this.text = gd3Var.r();
                        break;
                    case 58:
                        this.oldText = gd3Var.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.oldStatus = gd3Var.p();
                        break;
                    case 74:
                        if (this.oldAttaches == null) {
                            this.oldAttaches = new Protos.Attaches();
                        }
                        gd3Var.j(this.oldAttaches);
                        break;
                    case 80:
                        this.editAttaches = gd3Var.f();
                        break;
                    case 90:
                        if (this.oldElements == null) {
                            this.oldElements = new Protos.MessageElements();
                        }
                        gd3Var.j(this.oldElements);
                        break;
                    default:
                        if (!gd3Var.u(iS)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class MsgReact extends fl9 {
        private static volatile MsgReact[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public String reaction;
        public int reactionType;
        public long requestId;

        public MsgReact() {
            clear();
        }

        public static MsgReact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgReact[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgReact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgReact) fl9.mergeFrom(new MsgReact(), bArr);
        }

        public MsgReact clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.reaction = "";
            this.reactionType = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += hd3.h(5, j5);
            }
            if (!this.reaction.equals("")) {
                iH += hd3.l(6, this.reaction);
            }
            int i = this.reactionType;
            return i != 0 ? hd3.f(7, i) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
            if (!this.reaction.equals("")) {
                hd3Var.E(6, this.reaction);
            }
            int i = this.reactionType;
            if (i != 0) {
                hd3Var.w(7, i);
            }
        }

        public static MsgReact parseFrom(gd3 gd3Var) throws IOException {
            return new MsgReact().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgReact mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (iS == 32) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 40) {
                    this.messageServerId = gd3Var.q();
                } else if (iS == 50) {
                    this.reaction = gd3Var.r();
                } else if (iS == 56) {
                    int iP = gd3Var.p();
                    if (iP == 0 || iP == 1) {
                        this.reactionType = iP;
                    }
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgSend extends fl9 {
        private static volatile MsgSend[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long lastKnownDraftTime;
        public long messageId;
        public boolean notify;
        public long requestId;
        public long userId;

        public MsgSend() {
            clear();
        }

        public static MsgSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSend[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSend) fl9.mergeFrom(new MsgSend(), bArr);
        }

        public MsgSend clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.userId = 0L;
            this.notify = false;
            this.lastKnownDraftTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                iH += hd3.h(5, j5);
            }
            if (this.notify) {
                iH += hd3.a(6);
            }
            long j6 = this.lastKnownDraftTime;
            return j6 != 0 ? hd3.h(8, j6) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                hd3Var.x(5, j5);
            }
            boolean z = this.notify;
            if (z) {
                hd3Var.r(6, z);
            }
            long j6 = this.lastKnownDraftTime;
            if (j6 != 0) {
                hd3Var.x(8, j6);
            }
        }

        public static MsgSend parseFrom(gd3 gd3Var) throws IOException {
            return new MsgSend().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgSend mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.messageId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatId = gd3Var.q();
                } else if (iS == 32) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 40) {
                    this.userId = gd3Var.q();
                } else if (iS == 48) {
                    this.notify = gd3Var.f();
                } else if (iS == 64) {
                    this.lastKnownDraftTime = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgSendCallback extends fl9 {
        private static volatile MsgSendCallback[] _emptyArray;
        public ButtonPosition buttonPosition;
        public String buttonType;
        public String callbackId;
        public long messageId;
        public String payload;
        public long requestId;
        public long timestamp;

        public static final class ButtonPosition extends fl9 {
            private static volatile ButtonPosition[] _emptyArray;
            public int column;
            public int row;

            public ButtonPosition() {
                clear();
            }

            public static ButtonPosition[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ButtonPosition[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ButtonPosition parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ButtonPosition) fl9.mergeFrom(new ButtonPosition(), bArr);
            }

            public ButtonPosition clear() {
                this.row = 0;
                this.column = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int i = this.row;
                int iF = i != 0 ? hd3.f(1, i) : 0;
                int i2 = this.column;
                return i2 != 0 ? hd3.f(2, i2) + iF : iF;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                int i = this.row;
                if (i != 0) {
                    hd3Var.w(1, i);
                }
                int i2 = this.column;
                if (i2 != 0) {
                    hd3Var.w(2, i2);
                }
            }

            public static ButtonPosition parseFrom(gd3 gd3Var) throws IOException {
                return new ButtonPosition().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ButtonPosition mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.row = gd3Var.p();
                    } else if (iS == 16) {
                        this.column = gd3Var.p();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public MsgSendCallback() {
            clear();
        }

        public static MsgSendCallback[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSendCallback[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSendCallback parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSendCallback) fl9.mergeFrom(new MsgSendCallback(), bArr);
        }

        public MsgSendCallback clear() {
            this.requestId = 0L;
            this.callbackId = "";
            this.payload = "";
            this.timestamp = 0L;
            this.messageId = 0L;
            this.buttonPosition = null;
            this.buttonType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.callbackId.equals("")) {
                iH += hd3.l(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                iH += hd3.l(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                iH += hd3.h(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(5, j3);
            }
            ButtonPosition buttonPosition = this.buttonPosition;
            if (buttonPosition != null) {
                iH += hd3.i(6, buttonPosition);
            }
            return !this.buttonType.equals("") ? hd3.l(7, this.buttonType) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.callbackId.equals("")) {
                hd3Var.E(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                hd3Var.E(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
            ButtonPosition buttonPosition = this.buttonPosition;
            if (buttonPosition != null) {
                hd3Var.y(6, buttonPosition);
            }
            if (this.buttonType.equals("")) {
                return;
            }
            hd3Var.E(7, this.buttonType);
        }

        public static MsgSendCallback parseFrom(gd3 gd3Var) throws IOException {
            return new MsgSendCallback().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgSendCallback mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.callbackId = gd3Var.r();
                } else if (iS == 26) {
                    this.payload = gd3Var.r();
                } else if (iS == 32) {
                    this.timestamp = gd3Var.q();
                } else if (iS == 40) {
                    this.messageId = gd3Var.q();
                } else if (iS == 50) {
                    if (this.buttonPosition == null) {
                        this.buttonPosition = new ButtonPosition();
                    }
                    gd3Var.j(this.buttonPosition);
                } else if (iS == 58) {
                    this.buttonType = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgSharePreview extends fl9 {
        private static volatile MsgSharePreview[] _emptyArray;
        public long messageId;
        public long requestId;
        public String text;

        public MsgSharePreview() {
            clear();
        }

        public static MsgSharePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSharePreview[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSharePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSharePreview) fl9.mergeFrom(new MsgSharePreview(), bArr);
        }

        public MsgSharePreview clear() {
            this.requestId = 0L;
            this.text = "";
            this.messageId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.text.equals("")) {
                iH += hd3.l(2, this.text);
            }
            long j2 = this.messageId;
            return j2 != 0 ? hd3.h(3, j2) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.text.equals("")) {
                hd3Var.E(2, this.text);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
        }

        public static MsgSharePreview parseFrom(gd3 gd3Var) throws IOException {
            return new MsgSharePreview().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgSharePreview mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.text = gd3Var.r();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MsgView extends fl9 {
        private static volatile MsgView[] _emptyArray;
        public long chatId;
        public long[] messageIds;
        public boolean registerView;
        public long requestId;
        public long time;

        public MsgView() {
            clear();
        }

        public static MsgView[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgView[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgView parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgView) fl9.mergeFrom(new MsgView(), bArr);
        }

        public MsgView clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageIds = coi.b;
            this.registerView = false;
            this.time = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long[] jArr2 = this.messageIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.messageIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += hd3.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            if (this.registerView) {
                iH += hd3.a(4);
            }
            long j3 = this.time;
            return j3 != 0 ? hd3.h(5, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long[] jArr = this.messageIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.messageIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    hd3Var.x(3, jArr2[i]);
                    i++;
                }
            }
            boolean z = this.registerView;
            if (z) {
                hd3Var.r(4, z);
            }
            long j3 = this.time;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
        }

        public static MsgView parseFrom(gd3 gd3Var) throws IOException {
            return new MsgView().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MsgView mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    int iB = coi.b(gd3Var, 24);
                    long[] jArr = this.messageIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iB + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = gd3Var.q();
                        gd3Var.s();
                        length++;
                    }
                    jArr2[length] = gd3Var.q();
                    this.messageIds = jArr2;
                } else if (iS == 26) {
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i2++;
                    }
                    gd3Var.t(iC);
                    long[] jArr3 = this.messageIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = gd3Var.q();
                        length2++;
                    }
                    this.messageIds = jArr4;
                    gd3Var.d(iE);
                } else if (iS == 32) {
                    this.registerView = gd3Var.f();
                } else if (iS == 40) {
                    this.time = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class PhotoUpload extends fl9 {
        private static volatile PhotoUpload[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public Rect crop;
        public String file;
        public long messageId;
        public boolean profile;
        public long requestId;

        public PhotoUpload() {
            clear();
        }

        public static PhotoUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PhotoUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static PhotoUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PhotoUpload) fl9.mergeFrom(new PhotoUpload(), bArr);
        }

        public PhotoUpload clear() {
            this.requestId = 0L;
            this.file = "";
            this.profile = false;
            this.messageId = 0L;
            this.chatId = 0L;
            this.crop = null;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += hd3.l(2, this.file);
            }
            if (this.profile) {
                iH += hd3.a(3);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += hd3.h(5, j3);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += hd3.i(6, rect);
            }
            return !this.attachLocalId.equals("") ? hd3.l(7, this.attachLocalId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                hd3Var.E(2, this.file);
            }
            boolean z = this.profile;
            if (z) {
                hd3Var.r(3, z);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                hd3Var.x(5, j3);
            }
            Rect rect = this.crop;
            if (rect != null) {
                hd3Var.y(6, rect);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            hd3Var.E(7, this.attachLocalId);
        }

        public static PhotoUpload parseFrom(gd3 gd3Var) throws IOException {
            return new PhotoUpload().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public PhotoUpload mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.file = gd3Var.r();
                } else if (iS == 24) {
                    this.profile = gd3Var.f();
                } else if (iS == 32) {
                    this.messageId = gd3Var.q();
                } else if (iS == 40) {
                    this.chatId = gd3Var.q();
                } else if (iS == 50) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    gd3Var.j(this.crop);
                } else if (iS == 58) {
                    this.attachLocalId = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class PrepareFileUpload extends fl9 {
        private static volatile PrepareFileUpload[] _emptyArray;
        public String attachLocalId;
        public String fileName;
        public long messageId;
        public long requestId;
        public String uri;

        public PrepareFileUpload() {
            clear();
        }

        public static PrepareFileUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PrepareFileUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static PrepareFileUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PrepareFileUpload) fl9.mergeFrom(new PrepareFileUpload(), bArr);
        }

        public PrepareFileUpload clear() {
            this.requestId = 0L;
            this.uri = "";
            this.messageId = 0L;
            this.fileName = "";
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.uri.equals("")) {
                iH += hd3.l(2, this.uri);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(3, j2);
            }
            if (!this.fileName.equals("")) {
                iH += hd3.l(4, this.fileName);
            }
            return !this.attachLocalId.equals("") ? hd3.l(5, this.attachLocalId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.uri.equals("")) {
                hd3Var.E(2, this.uri);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            if (!this.fileName.equals("")) {
                hd3Var.E(4, this.fileName);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            hd3Var.E(5, this.attachLocalId);
        }

        public static PrepareFileUpload parseFrom(gd3 gd3Var) throws IOException {
            return new PrepareFileUpload().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public PrepareFileUpload mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.uri = gd3Var.r();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (iS == 34) {
                    this.fileName = gd3Var.r();
                } else if (iS == 42) {
                    this.attachLocalId = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class Profile extends fl9 {
        private static volatile Profile[] _emptyArray;
        public String avatarType;
        public Rect crop;
        public String description;
        public String firstName;
        public String lastName;
        public String link;
        public long photoId;
        public String photoToken;
        public long requestId;

        public Profile() {
            clear();
        }

        public static Profile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Profile[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Profile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Profile) fl9.mergeFrom(new Profile(), bArr);
        }

        public Profile clear() {
            this.requestId = 0L;
            this.photoToken = "";
            this.crop = null;
            this.description = "";
            this.link = "";
            this.photoId = 0L;
            this.firstName = "";
            this.lastName = "";
            this.avatarType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.photoToken.equals("")) {
                iH += hd3.l(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += hd3.i(4, rect);
            }
            if (!this.description.equals("")) {
                iH += hd3.l(5, this.description);
            }
            if (!this.link.equals("")) {
                iH += hd3.l(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                iH += hd3.h(7, j2);
            }
            if (!this.firstName.equals("")) {
                iH += hd3.l(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                iH += hd3.l(9, this.lastName);
            }
            return !this.avatarType.equals("") ? hd3.l(10, this.avatarType) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.photoToken.equals("")) {
                hd3Var.E(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                hd3Var.y(4, rect);
            }
            if (!this.description.equals("")) {
                hd3Var.E(5, this.description);
            }
            if (!this.link.equals("")) {
                hd3Var.E(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                hd3Var.x(7, j2);
            }
            if (!this.firstName.equals("")) {
                hd3Var.E(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                hd3Var.E(9, this.lastName);
            }
            if (this.avatarType.equals("")) {
                return;
            }
            hd3Var.E(10, this.avatarType);
        }

        public static Profile parseFrom(gd3 gd3Var) throws IOException {
            return new Profile().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public Profile mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 26) {
                    this.photoToken = gd3Var.r();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    gd3Var.j(this.crop);
                } else if (iS == 42) {
                    this.description = gd3Var.r();
                } else if (iS == 50) {
                    this.link = gd3Var.r();
                } else if (iS == 56) {
                    this.photoId = gd3Var.q();
                } else if (iS == 66) {
                    this.firstName = gd3Var.r();
                } else if (iS == 74) {
                    this.lastName = gd3Var.r();
                } else if (iS == 82) {
                    this.avatarType = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class Rect extends fl9 {
        private static volatile Rect[] _emptyArray;
        public float bottom;
        public float left;
        public float right;
        public float top;

        public Rect() {
            clear();
        }

        public static Rect[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Rect[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Rect) fl9.mergeFrom(new Rect(), bArr);
        }

        public Rect clear() {
            this.left = 0.0f;
            this.top = 0.0f;
            this.right = 0.0f;
            this.bottom = 0.0f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            int iE = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? hd3.e(1) : 0;
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                iE += hd3.e(2);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                iE += hd3.e(3);
            }
            return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? hd3.e(4) + iE : iE;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                hd3Var.v(1, this.left);
            }
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                hd3Var.v(2, this.top);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                hd3Var.v(3, this.right);
            }
            if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                hd3Var.v(4, this.bottom);
            }
        }

        public static Rect parseFrom(gd3 gd3Var) throws IOException {
            return new Rect().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public Rect mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 13) {
                    this.left = gd3Var.i();
                } else if (iS == 21) {
                    this.top = gd3Var.i();
                } else if (iS == 29) {
                    this.right = gd3Var.i();
                } else if (iS == 37) {
                    this.bottom = gd3Var.i();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class RemoveContactPhoto extends fl9 {
        private static volatile RemoveContactPhoto[] _emptyArray;
        public long photoId;
        public long requestId;

        public RemoveContactPhoto() {
            clear();
        }

        public static RemoveContactPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RemoveContactPhoto[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static RemoveContactPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RemoveContactPhoto) fl9.mergeFrom(new RemoveContactPhoto(), bArr);
        }

        public RemoveContactPhoto clear() {
            this.requestId = 0L;
            this.photoId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.photoId;
            return j2 != 0 ? hd3.h(2, j2) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
        }

        public static RemoveContactPhoto parseFrom(gd3 gd3Var) throws IOException {
            return new RemoveContactPhoto().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public RemoveContactPhoto mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.photoId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class SuspendBot extends fl9 {
        private static volatile SuspendBot[] _emptyArray;
        public long botId;
        public long chatId;
        public long requestId;
        public boolean suspend;

        public SuspendBot() {
            clear();
        }

        public static SuspendBot[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SuspendBot[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static SuspendBot parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SuspendBot) fl9.mergeFrom(new SuspendBot(), bArr);
        }

        public SuspendBot clear() {
            this.requestId = 0L;
            this.botId = 0L;
            this.chatId = 0L;
            this.suspend = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.botId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            return this.suspend ? hd3.a(4) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.botId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            boolean z = this.suspend;
            if (z) {
                hd3Var.r(4, z);
            }
        }

        public static SuspendBot parseFrom(gd3 gd3Var) throws IOException {
            return new SuspendBot().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public SuspendBot mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.botId = gd3Var.q();
                } else if (iS == 24) {
                    this.chatId = gd3Var.q();
                } else if (iS == 32) {
                    this.suspend = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class SyncChatHistory extends fl9 {
        private static volatile SyncChatHistory[] _emptyArray;
        public long chatId;
        public int count;
        public int itemTypeId;
        public long taskId;

        public SyncChatHistory() {
            clear();
        }

        public static SyncChatHistory[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SyncChatHistory[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static SyncChatHistory parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SyncChatHistory) fl9.mergeFrom(new SyncChatHistory(), bArr);
        }

        public SyncChatHistory clear() {
            this.taskId = 0L;
            this.chatId = 0L;
            this.count = 0;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.taskId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                iH += hd3.f(3, i);
            }
            int i2 = this.itemTypeId;
            return i2 != 0 ? hd3.f(4, i2) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                hd3Var.w(3, i);
            }
            int i2 = this.itemTypeId;
            if (i2 != 0) {
                hd3Var.w(4, i2);
            }
        }

        public static SyncChatHistory parseFrom(gd3 gd3Var) throws IOException {
            return new SyncChatHistory().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public SyncChatHistory mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.taskId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.count = gd3Var.p();
                } else if (iS == 32) {
                    this.itemTypeId = gd3Var.p();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class UpdateFireTimeProtoTask extends fl9 {
        private static volatile UpdateFireTimeProtoTask[] _emptyArray;
        public long chatId;
        public long fireTime;
        public long messageId;
        public boolean notifySender;
        public long requestId;

        public UpdateFireTimeProtoTask() {
            clear();
        }

        public static UpdateFireTimeProtoTask[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new UpdateFireTimeProtoTask[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static UpdateFireTimeProtoTask parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (UpdateFireTimeProtoTask) fl9.mergeFrom(new UpdateFireTimeProtoTask(), bArr);
        }

        public UpdateFireTimeProtoTask clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.fireTime = 0L;
            this.notifySender = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                iH += hd3.h(4, j4);
            }
            return this.notifySender ? hd3.a(5) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                hd3Var.x(4, j4);
            }
            boolean z = this.notifySender;
            if (z) {
                hd3Var.r(5, z);
            }
        }

        public static UpdateFireTimeProtoTask parseFrom(gd3 gd3Var) throws IOException {
            return new UpdateFireTimeProtoTask().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public UpdateFireTimeProtoTask mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.chatId = gd3Var.q();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (iS == 32) {
                    this.fireTime = gd3Var.q();
                } else if (iS == 40) {
                    this.notifySender = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class VideoConvert extends fl9 {
        private static volatile VideoConvert[] _emptyArray;
        public String attachLocalId;
        public String dstPath;
        public float endPosition;
        public long messageId;
        public Quality quality;
        public long requestId;
        public String srcPath;
        public float startPosition;

        public static final class Quality extends fl9 {
            private static volatile Quality[] _emptyArray;
            public int bitrate;
            public int height;
            public boolean isOriginal;
            public int ordinal;
            public int width;

            public Quality() {
                clear();
            }

            public static Quality[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Quality[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Quality) fl9.mergeFrom(new Quality(), bArr);
            }

            public Quality clear() {
                this.ordinal = 0;
                this.width = 0;
                this.height = 0;
                this.isOriginal = false;
                this.bitrate = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int i = this.ordinal;
                int iF = i != 0 ? hd3.f(1, i) : 0;
                int i2 = this.width;
                if (i2 != 0) {
                    iF += hd3.f(2, i2);
                }
                int i3 = this.height;
                if (i3 != 0) {
                    iF += hd3.f(3, i3);
                }
                if (this.isOriginal) {
                    iF += hd3.a(4);
                }
                int i4 = this.bitrate;
                return i4 != 0 ? hd3.f(5, i4) + iF : iF;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                int i = this.ordinal;
                if (i != 0) {
                    hd3Var.w(1, i);
                }
                int i2 = this.width;
                if (i2 != 0) {
                    hd3Var.w(2, i2);
                }
                int i3 = this.height;
                if (i3 != 0) {
                    hd3Var.w(3, i3);
                }
                boolean z = this.isOriginal;
                if (z) {
                    hd3Var.r(4, z);
                }
                int i4 = this.bitrate;
                if (i4 != 0) {
                    hd3Var.w(5, i4);
                }
            }

            public static Quality parseFrom(gd3 gd3Var) throws IOException {
                return new Quality().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public Quality mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.ordinal = gd3Var.p();
                    } else if (iS == 16) {
                        this.width = gd3Var.p();
                    } else if (iS == 24) {
                        this.height = gd3Var.p();
                    } else if (iS == 32) {
                        this.isOriginal = gd3Var.f();
                    } else if (iS == 40) {
                        this.bitrate = gd3Var.p();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public VideoConvert() {
            clear();
        }

        public static VideoConvert[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoConvert[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoConvert parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoConvert) fl9.mergeFrom(new VideoConvert(), bArr);
        }

        public VideoConvert clear() {
            this.requestId = 0L;
            this.srcPath = "";
            this.dstPath = "";
            this.quality = null;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.startPosition = 0.0f;
            this.endPosition = 0.0f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.srcPath.equals("")) {
                iH += hd3.l(2, this.srcPath);
            }
            if (!this.dstPath.equals("")) {
                iH += hd3.l(3, this.dstPath);
            }
            Quality quality = this.quality;
            if (quality != null) {
                iH += hd3.i(4, quality);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(5, j2);
            }
            if (!this.attachLocalId.equals("")) {
                iH += hd3.l(6, this.attachLocalId);
            }
            if (Float.floatToIntBits(this.startPosition) != Float.floatToIntBits(0.0f)) {
                iH += hd3.e(7);
            }
            return Float.floatToIntBits(this.endPosition) != Float.floatToIntBits(0.0f) ? hd3.e(8) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.srcPath.equals("")) {
                hd3Var.E(2, this.srcPath);
            }
            if (!this.dstPath.equals("")) {
                hd3Var.E(3, this.dstPath);
            }
            Quality quality = this.quality;
            if (quality != null) {
                hd3Var.y(4, quality);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(5, j2);
            }
            if (!this.attachLocalId.equals("")) {
                hd3Var.E(6, this.attachLocalId);
            }
            if (Float.floatToIntBits(this.startPosition) != Float.floatToIntBits(0.0f)) {
                hd3Var.v(7, this.startPosition);
            }
            if (Float.floatToIntBits(this.endPosition) != Float.floatToIntBits(0.0f)) {
                hd3Var.v(8, this.endPosition);
            }
        }

        public static VideoConvert parseFrom(gd3 gd3Var) throws IOException {
            return new VideoConvert().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public VideoConvert mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.srcPath = gd3Var.r();
                } else if (iS == 26) {
                    this.dstPath = gd3Var.r();
                } else if (iS == 34) {
                    if (this.quality == null) {
                        this.quality = new Quality();
                    }
                    gd3Var.j(this.quality);
                } else if (iS == 40) {
                    this.messageId = gd3Var.q();
                } else if (iS == 50) {
                    this.attachLocalId = gd3Var.r();
                } else if (iS == 61) {
                    this.startPosition = gd3Var.i();
                } else if (iS == 69) {
                    this.endPosition = gd3Var.i();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class VideoPlay extends fl9 {
        private static volatile VideoPlay[] _emptyArray;
        public String attachLocalId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long requestId;
        public boolean saveToGallery;
        public boolean startDownload;
        public String token;
        public long videoId;

        public VideoPlay() {
            clear();
        }

        public static VideoPlay[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoPlay[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoPlay) fl9.mergeFrom(new VideoPlay(), bArr);
        }

        public VideoPlay clear() {
            this.requestId = 0L;
            this.videoId = 0L;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.startDownload = false;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.token = "";
            this.saveToGallery = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            long j2 = this.videoId;
            if (j2 != 0) {
                iH += hd3.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += hd3.h(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                iH += hd3.l(4, this.attachLocalId);
            }
            if (this.startDownload) {
                iH += hd3.a(5);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += hd3.h(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += hd3.h(7, j5);
            }
            if (!this.token.equals("")) {
                iH += hd3.l(8, this.token);
            }
            return this.saveToGallery ? hd3.a(9) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            long j2 = this.videoId;
            if (j2 != 0) {
                hd3Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                hd3Var.x(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                hd3Var.E(4, this.attachLocalId);
            }
            boolean z = this.startDownload;
            if (z) {
                hd3Var.r(5, z);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                hd3Var.x(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                hd3Var.x(7, j5);
            }
            if (!this.token.equals("")) {
                hd3Var.E(8, this.token);
            }
            boolean z2 = this.saveToGallery;
            if (z2) {
                hd3Var.r(9, z2);
            }
        }

        public static VideoPlay parseFrom(gd3 gd3Var) throws IOException {
            return new VideoPlay().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public VideoPlay mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 16) {
                    this.videoId = gd3Var.q();
                } else if (iS == 24) {
                    this.messageId = gd3Var.q();
                } else if (iS == 34) {
                    this.attachLocalId = gd3Var.r();
                } else if (iS == 40) {
                    this.startDownload = gd3Var.f();
                } else if (iS == 48) {
                    this.chatServerId = gd3Var.q();
                } else if (iS == 56) {
                    this.messageServerId = gd3Var.q();
                } else if (iS == 66) {
                    this.token = gd3Var.r();
                } else if (iS == 72) {
                    this.saveToGallery = gd3Var.f();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class VideoUpload extends fl9 {
        private static volatile VideoUpload[] _emptyArray;
        public String attachLocalId;
        public boolean audio;
        public String file;
        public long messageId;
        public long requestId;

        public VideoUpload() {
            clear();
        }

        public static VideoUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoUpload) fl9.mergeFrom(new VideoUpload(), bArr);
        }

        public VideoUpload clear() {
            this.requestId = 0L;
            this.file = "";
            this.audio = false;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += hd3.l(2, this.file);
            }
            if (this.audio) {
                iH += hd3.a(3);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += hd3.h(4, j2);
            }
            return !this.attachLocalId.equals("") ? hd3.l(5, this.attachLocalId) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.file.equals("")) {
                hd3Var.E(2, this.file);
            }
            boolean z = this.audio;
            if (z) {
                hd3Var.r(3, z);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            hd3Var.E(5, this.attachLocalId);
        }

        public static VideoUpload parseFrom(gd3 gd3Var) throws IOException {
            return new VideoUpload().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public VideoUpload mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.requestId = gd3Var.q();
                } else if (iS == 18) {
                    this.file = gd3Var.r();
                } else if (iS == 24) {
                    this.audio = gd3Var.f();
                } else if (iS == 32) {
                    this.messageId = gd3Var.q();
                } else if (iS == 42) {
                    this.attachLocalId = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }
}
